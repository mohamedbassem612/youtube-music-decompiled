package defpackage;

import j$.util.Collection;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class usk implements uss {
    public final File a;
    private final boolean b;

    public usk(File file, boolean z) {
        this.a = file;
        this.b = z;
    }

    @Override // defpackage.uss
    public final boolean a(augy augyVar) {
        try {
            String canonicalPath = this.a.getCanonicalPath();
            agjz agjzVar = new agjz(4);
            int i = augyVar.c;
            if (i == 101) {
                agjzVar.h(((augu) augyVar.d).g);
            } else if (i == 103) {
                agjzVar.h(((augr) augyVar.d).c);
            } else if (i == 102) {
                agjzVar.h(((augt) augyVar.d).e);
            } else if (i == 105) {
                agjzVar.h(((augs) augyVar.d).c);
            } else if (i == 106) {
                agjzVar.h(((augv) augyVar.d).c);
            }
            if (!Collection.EL.stream((agke) Collection.EL.stream(agjzVar.g()).map(new uot(this, 5)).collect(aghu.a)).allMatch(new sco(canonicalPath, 20))) {
                return false;
            }
            if (this.b) {
                aigu aiguVar = augyVar.i;
                if (aiguVar == null) {
                    aiguVar = aigu.a;
                }
                if (aikw.e(aiguVar)) {
                    return false;
                }
                aigu aiguVar2 = augyVar.j;
                if (aiguVar2 == null) {
                    aiguVar2 = aigu.a;
                }
                aikw.f(aiguVar2);
                if (aikw.e(aiguVar2) || aiguVar2.equals(aikw.a)) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
