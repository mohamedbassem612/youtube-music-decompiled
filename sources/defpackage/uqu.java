package defpackage;

import android.util.Range;
import android.util.Size;
import j$.util.Optional;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uqu {
    public UUID a;
    public Size b;
    public urn c;
    public Range d;
    public Optional e;
    public Size f;
    public xsc g;
    private augy h;
    private boolean i;
    private boolean j;
    private agkz k;
    private Optional l;
    private byte m;

    public uqu(uqv uqvVar) {
        this.l = Optional.empty();
        this.e = Optional.empty();
        this.a = uqvVar.a;
        this.b = uqvVar.b;
        this.h = uqvVar.c;
        this.c = uqvVar.d;
        this.i = uqvVar.e;
        this.j = uqvVar.f;
        this.k = uqvVar.g;
        this.l = uqvVar.h;
        this.d = uqvVar.i;
        this.g = uqvVar.l;
        this.e = uqvVar.j;
        this.f = uqvVar.k;
        this.m = (byte) 3;
    }

    public final uqv a() {
        UUID uuid;
        Size size;
        augy augyVar;
        urn urnVar;
        agkz agkzVar;
        Range range;
        xsc xscVar;
        Size size2;
        if (this.m == 3 && (uuid = this.a) != null && (size = this.b) != null && (augyVar = this.h) != null && (urnVar = this.c) != null && (agkzVar = this.k) != null && (range = this.d) != null && (xscVar = this.g) != null && (size2 = this.f) != null) {
            return new uqv(uuid, size, augyVar, urnVar, this.i, this.j, agkzVar, this.l, range, xscVar, this.e, size2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" referenceId");
        }
        if (this.b == null) {
            sb.append(" boundSize");
        }
        if (this.h == null) {
            sb.append(" initialProto");
        }
        if (this.c == null) {
            sb.append(" cumulativeMotionEventDiff");
        }
        if ((this.m & 1) == 0) {
            sb.append(" isTapPossible");
        }
        if ((this.m & 2) == 0) {
            sb.append(" highlightTrashCan");
        }
        if (this.k == null) {
            sb.append(" activeGuidelines");
        }
        if (this.d == null) {
            sb.append(" scaleRange");
        }
        if (this.g == null) {
            sb.append(" guidelineHelper");
        }
        if (this.f == null) {
            sb.append(" playerDimensions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(auaj auajVar) {
        this.l = Optional.of(auajVar);
    }

    public final void c(agkz agkzVar) {
        if (agkzVar == null) {
            throw new NullPointerException("Null activeGuidelines");
        }
        this.k = agkzVar;
    }

    public final void d(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 2);
    }

    public final void e(augy augyVar) {
        if (augyVar == null) {
            throw new NullPointerException("Null initialProto");
        }
        this.h = augyVar;
    }

    public final void f(boolean z) {
        this.i = z;
        this.m = (byte) (this.m | 1);
    }

    public uqu() {
        this.l = Optional.empty();
        this.e = Optional.empty();
    }
}
