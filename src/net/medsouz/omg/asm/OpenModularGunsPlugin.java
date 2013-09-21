package net.medsouz.omg.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLCallHook;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@TransformerExclusions(value = {"net.medsouz.omg.asm"})
@MCVersion("1.6.4")
public class OpenModularGunsPlugin implements IFMLLoadingPlugin, IFMLCallHook{
	
	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[] {"net.medsouz.omg.asm.ModelBipedTransformer"};
	}

	@Override
	public String getModContainerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSetupClass() {
		return "net.medsouz.omg.asm.OpenModularGunsPlugin";
	}

	@Override
	public void injectData(Map<String, Object> data) {
		
	}

}
