package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wjx implements vzi {
    private final /* synthetic */ int $cid;

    public /* synthetic */ wjx(int i) {
        this.$cid = i;
    }

    private static void b(ajir ajirVar, ArrayList arrayList) {
        ajwo ajwoVar;
        if ((ajirVar.b & 4) != 0) {
            ajiq ajiqVar = ajirVar.e;
            if (ajiqVar == null) {
                ajiqVar = ajiq.a;
            }
            int i = ajiqVar.b;
            ajwo ajwoVar2 = null;
            if (i == 84996305) {
                ajip ajipVar = i == 84996305 ? (ajip) ajiqVar.c : ajip.a;
                int i2 = ajipVar.b & 1;
                if (i2 != 0) {
                    if (i2 != 0) {
                        ajwoVar = ajipVar.c;
                        if (ajwoVar == null) {
                            ajwoVar = ajwo.a;
                        }
                    } else {
                        ajwoVar = null;
                    }
                    arrayList.add(ajwoVar);
                }
            }
            int i3 = ajiqVar.b;
            if (i3 == 111631903) {
                ajio ajioVar = i3 == 111631903 ? (ajio) ajiqVar.c : ajio.a;
                int i4 = ajioVar.b & 1;
                if (i4 != 0) {
                    if (i4 != 0 && (ajwoVar2 = ajioVar.c) == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    arrayList.add(ajwoVar2);
                }
            }
        }
    }

    @Override // defpackage.vzi
    public final List a(Object obj) {
        if (this.$cid == 0) {
            return agpi.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!(obj instanceof amae)) {
            return arrayList;
        }
        amae amaeVar = (amae) obj;
        if ((amaeVar.b & 2) == 0) {
            return arrayList;
        }
        amaf amafVar = amaeVar.e;
        if (amafVar == null) {
            amafVar = amaf.a;
        }
        int i = amafVar.b;
        if (i != 51779735) {
            return arrayList;
        }
        alzv alzvVar = i == 51779735 ? (alzv) amafVar.c : alzv.a;
        if ((alzvVar.b & 4) != 0) {
            alzr alzrVar = alzvVar.e;
            if (alzrVar == null) {
                alzrVar = alzr.a;
            }
            int i2 = alzrVar.b;
            if (i2 == 46659098) {
                ajis ajisVar = i2 == 46659098 ? (ajis) alzrVar.c : ajis.a;
                Iterator it = ajisVar.b.iterator();
                while (it.hasNext()) {
                    b((ajir) it.next(), arrayList);
                }
                Iterator it2 = ajisVar.c.iterator();
                while (it2.hasNext()) {
                    b((ajir) it2.next(), arrayList);
                }
                Iterator it3 = ajisVar.d.iterator();
                while (it3.hasNext()) {
                    b((ajir) it3.next(), arrayList);
                }
            }
        }
        if ((alzvVar.b & 2) == 0) {
            return arrayList;
        }
        alzt alztVar = alzvVar.d;
        if (alztVar == null) {
            alztVar = alzt.a;
        }
        int i3 = alztVar.b;
        if (i3 != 50631000) {
            return arrayList;
        }
        for (aoui aouiVar : (i3 == 50631000 ? (aouj) alztVar.c : aouj.a).g) {
            if ((aouiVar.b & 1) != 0) {
                aoun aounVar = aouiVar.c;
                if (aounVar == null) {
                    aounVar = aoun.a;
                }
                ajwo ajwoVar = aounVar.l;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                arrayList.add(ajwoVar);
            }
        }
        return arrayList;
    }
}
