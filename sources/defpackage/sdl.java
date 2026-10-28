package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class sdl implements Comparator, Serializable {
    private static final long serialVersionUID = 1;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int iBi;
        int iBi2;
        aisu aisuVar = (aisu) obj;
        aisu aisuVar2 = (aisu) obj2;
        int i2 = aisuVar.f;
        int iBi3 = a.bi(i2);
        if ((iBi3 == 0 || iBi3 != 2) && ((iBi = a.bi((i = aisuVar2.f))) == 0 || iBi != 2)) {
            int iBi4 = a.bi(i2);
            if ((iBi4 == 0 || iBi4 != 8) && ((iBi2 = a.bi(i)) == 0 || iBi2 != 8)) {
                int iBi5 = a.bi(i2);
                if (iBi5 == 0 || iBi5 != 4) {
                    int iBi6 = a.bi(i);
                    if (iBi6 == 0 || iBi6 != 4) {
                        return aisuVar.c - aisuVar2.c;
                    }
                    return -1;
                }
                int iBi7 = a.bi(i);
                if (iBi7 != 0 && iBi7 == 4) {
                    return 0;
                }
            } else {
                int iBi8 = a.bi(i2);
                if (iBi8 == 0 || iBi8 != 8) {
                    return -1;
                }
            }
        } else {
            int iBi9 = a.bi(i2);
            if (iBi9 != 0 && iBi9 == 2) {
                return -1;
            }
        }
        return 1;
    }
}
