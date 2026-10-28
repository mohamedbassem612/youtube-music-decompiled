package defpackage;

import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acui implements actu {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/reel/internal/player/ReelSequenceNavigator");
    public final Set b = new HashSet();
    public avmn c;
    public alqc d;
    public final actv e;

    public acui(actv actvVar) {
        this.e = actvVar;
        this.c = actvVar.a.ag(new acte(this, 19), new acrr(6));
        actvVar.z(this);
    }

    public static final int a(abtu abtuVar) {
        abtt abttVar = abtt.NEXT;
        return abtuVar.e.ordinal() != 4 ? 1 : 2;
    }

    public static final abnl b(abtu abtuVar) {
        abtt abttVar = abtt.NEXT;
        abtt abttVar2 = abtuVar.e;
        int iOrdinal = abttVar2.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            throw new UnsupportedOperationException("Unsupported Autoplay navigation type: ".concat(abttVar2.toString()));
        }
        if (iOrdinal == 4) {
            return abtuVar.f;
        }
        throw new UnsupportedOperationException("Unsupported navigation type: ".concat(abttVar2.toString()));
    }

    private final synchronized void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((abtv) it.next()).k();
        }
    }

    @Override // defpackage.actu
    public final void l(acsu acsuVar) {
        acsuVar.getClass();
        Objects.checkIndex(0, 2);
        if (acsuVar instanceof acso) {
            this.d = ((acso) acsuVar).b;
            c();
        }
    }
}
