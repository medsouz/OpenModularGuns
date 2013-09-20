import urllib, zipfile, os, sys, shutil
#Based off of the Miney installer
def runNative(cmd):
	out = os.system(cmd)
	if(out != 0):
		print("===================================")
		print("OpenModularGuns setup failed with error code "+str(out))
		print("===================================")
		sys.exit(1)

print("  ______   .______    _______ .__   __.                                       ")
print(" /  __  \  |   _  \  |   ____||  \ |  |                                       ")
print("|  |  |  | |  |_)  | |  |__   |   \|  |                                       ")
print("|  |  |  | |   ___/  |   __|  |  . `  |                                       ")
print("|  `--'  | |  |      |  |____ |  |\   |                                       ")
print(" \______/  | _|      |_______||__| \__|                                       ")
print("                                                                              ")
print(".___  ___.   ______    _______   __    __   __          ___      .______      ")
print("|   \/   |  /  __  \  |       \ |  |  |  | |  |        /   \     |   _  \     ")
print("|  \  /  | |  |  |  | |  .--.  ||  |  |  | |  |       /  ^  \    |  |_)  |    ")
print("|  |\/|  | |  |  |  | |  |  |  ||  |  |  | |  |      /  /_\  \   |      /     ")
print("|  |  |  | |  `--'  | |  '--'  ||  `--'  | |  `----./  _____  \  |  |\  \----.")
print("|__|  |__|  \______/  |_______/  \______/  |_______/__/     \__\ | _| `._____|")
print("                                                                              ")
print("  _______  __    __  .__   __.      _______.                                  ")
print(" /  _____||  |  |  | |  \ |  |     /       |                                  ")
print("|  |  __  |  |  |  | |   \|  |    |   (----`                                  ")
print("|  | |_ | |  |  |  | |  . `  |     \   \                                      ")
print("|  |__| | |  `--'  | |  |\   | .----)   |                                     ")
print(" \______|  \______/  |__| \__| |_______/                                      ")
print("Cleaning the repository...")
if(os.path.exists("forge/")):
		print("Removing Forge")
		if(os.path.exists("forge/mcp/src/minecraft/net/medsouz/omg/")):
			if(os.path.islink("forge/mcp/src/minecraft/net/medsouz/omg/")):
				os.unlink("forge/mcp/src/minecraft/net/medsouz/omg/")
			else:
				os.rmdir("forge/mcp/src/minecraft/net/medsouz/omg/")
		if(os.path.exists("forge/mcp/src/minecraft/assets/")):
			if(os.path.islink("forge/mcp/src/minecraft/assets/")):
				os.unlink("forge/mcp/src/minecraft/assets/")
			else:
				os.rmdir("forge/mcp/src/minecraft/assets/")
		shutil.rmtree("forge/")
else:
	print("Forge not found")
print("===================================")
print("Downloading recommended Forge build...")
urllib.urlretrieve ("http://files.minecraftforge.net/minecraftforge/minecraftforge-src-recommended.zip", "forge.zip")
print("Forge downloaded! Extracting...")
with zipfile.ZipFile("forge.zip", "r") as z:
	z.extractall();
print("Forge has been extracted, cleaning up zip file...")
os.remove("forge.zip")
print("===================================")
print("Changing directory to forge\'s directory...")
os.chdir("forge/")
print("Running forge install script...")
sys.stdout.flush()
if(sys.platform.startswith("linux") or sys.platform.startswith("darwin")):
	runNative("python install.py")
	runNative("mkdir mcp/src/minecraft/net/medsouz/")
	runNative("ln -s ../../../../../../src/net/medsouz/omg mcp/src/minecraft/net/medsouz/omg")
	runNative("ln -s ../../../../../src/assets/omg mcp/src/minecraft/assets/omg")
elif(sys.platform.startswith("win32")):
	runNative("python install.py")
	runNative("mkdir mcp\\src\\minecraft\\net\\medsouz\\")
	runNative("mklink /j mcp\\src\\minecraft\\net\\medsouz\\omg ..\\src\\net\\medsouz\\omg")
	runNative("mklink /j mcp\\src\\minecraft\\assets ..\\src\\assets")
print("===================================")
print("Placing dummy jar... (Allows the coremod to be launched from the development environment)")
os.makedirs("mcp/jars/mods/")
shutil.copyfile("../omg_dummy.jar", "mcp/jars/mods/omg_dummy.jar");
print("===================================")
print("OpenModularGuns has been set up successfully!")
print("You can now use the forge folder to work on OpenModularGuns")
print("Thank you for your contributions!")
print("    <3 medsouz")
print("===================================")