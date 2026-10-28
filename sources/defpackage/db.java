package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class db implements cy {
    final /* synthetic */ dd a;
    private final String b;

    public db(dd ddVar, String str) {
        this.a = ddVar;
        this.b = str;
    }

    @Override // defpackage.cy
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        dd ddVar = this.a;
        ay ayVar = (ay) ddVar.j.remove(this.b);
        boolean z = false;
        if (ayVar != null) {
            HashMap map = new HashMap();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                av avVar = (av) arrayList.get(i);
                if (avVar.d) {
                    ArrayList arrayList3 = avVar.e;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        cc ccVar = ((dm) arrayList3.get(i2)).b;
                        if (ccVar != null) {
                            map.put(ccVar.mWho, ccVar);
                        }
                    }
                }
            }
            List<String> list = ayVar.a;
            HashMap map2 = new HashMap(list.size());
            for (String str : list) {
                cc ccVar2 = (cc) map.get(str);
                if (ccVar2 != null) {
                    map2.put(ccVar2.mWho, ccVar2);
                } else {
                    Bundle bundleA = ddVar.C.a(str, null);
                    if (bundleA != null) {
                        ClassLoader classLoader = ddVar.p.c.getClassLoader();
                        cc ccVarA = ((dj) bundleA.getParcelable("state")).a(ddVar.j());
                        ccVarA.mSavedFragmentState = bundleA;
                        if (ccVarA.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                            ccVarA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleA.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        ccVarA.setArguments(bundle);
                        map2.put(ccVarA.mWho, ccVarA);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (aw awVar : ayVar.b) {
                av avVar2 = new av(ddVar);
                awVar.a(avVar2);
                int i3 = 0;
                while (true) {
                    ArrayList arrayList5 = awVar.b;
                    if (i3 < arrayList5.size()) {
                        String str2 = (String) arrayList5.get(i3);
                        if (str2 != null) {
                            cc ccVar3 = (cc) map2.get(str2);
                            if (ccVar3 == null) {
                                throw new IllegalStateException("Restoring FragmentTransaction " + awVar.f + " failed due to missing saved state for Fragment (" + str2 + ')');
                            }
                            ((dm) avVar2.e.get(i3)).b = ccVar3;
                        }
                        i3++;
                    }
                }
                arrayList4.add(avVar2);
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ((av) it.next()).i(arrayList, arrayList2);
                z = true;
            }
        }
        return z;
    }
}
