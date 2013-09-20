python setup.py
rc=$?
if [[ $rc != 0 ]] ; then
    exit $rc
fi
cd forge/mcp/
python runtime/recompile.py
rc=$?
if [[ $rc != 0 ]] ; then
    exit $rc
fi
python runtime/reobfuscate.py
rc=$?
if [[ $rc != 0 ]] ; then
    exit $rc
fi
echo "OpenModularGun has compiled successfully!";