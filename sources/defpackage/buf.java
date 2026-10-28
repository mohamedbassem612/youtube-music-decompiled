package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class buf {
    public final agke a;
    public final List b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public buf(agke agkeVar) {
        this.a = agkeVar;
        bug bugVar = bug.a;
        this.d = false;
    }

    private final int i() {
        return this.c.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z;
        do {
            z = false;
            for (int i = 0; i <= i(); i++) {
                if (!this.c[i].hasRemaining()) {
                    List list = this.b;
                    buj bujVar = (buj) list.get(i);
                    if (!bujVar.i()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : buj.a;
                        long jRemaining = byteBuffer2.remaining();
                        bujVar.f(byteBuffer2);
                        this.c[i] = bujVar.c();
                        boolean z2 = true;
                        if (jRemaining - ((long) byteBuffer2.remaining()) <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < i()) {
                        ((buj) list.get(i + 1)).e();
                    }
                }
            }
        } while (z);
    }

    public final bug a(bug bugVar) {
        bug bugVar2 = bug.a;
        if (bugVar.equals(bugVar2)) {
            throw new bui("Unhandled input format:", bugVar);
        }
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return bugVar;
            }
            buj bujVar = (buj) agkeVar.get(i);
            bug bugVarB = bujVar.b(bugVar);
            if (bujVar.h()) {
                ahno.O(!bugVarB.equals(bugVar2));
                bugVar = bugVarB;
            }
            i++;
        }
    }

    public final ByteBuffer b() {
        if (!h()) {
            return buj.a;
        }
        ByteBuffer byteBuffer = this.c[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(buj.a);
        return this.c[i()];
    }

    @Deprecated
    public final void c() {
        d(buh.a);
    }

    public final void d(buh buhVar) {
        List list = this.b;
        list.clear();
        this.d = false;
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            buj bujVar = (buj) agkeVar.get(i);
            bujVar.j();
            if (bujVar.h()) {
                acbr acbrVar = new acbr(buhVar);
                acbrVar.a = bujVar.a(buhVar.b);
                buhVar = acbrVar.a();
                list.add(bujVar);
            }
            i++;
        }
        this.c = new ByteBuffer[list.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.c[i2] = ((buj) list.get(i2)).c();
        }
    }

    public final void e() {
        if (!h() || this.d) {
            return;
        }
        this.d = true;
        ((buj) this.b.get(0)).e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof buf) {
            agke agkeVar = this.a;
            agke agkeVar2 = ((buf) obj).a;
            int i = ((agpi) agkeVar2).d;
            int i2 = ((agpi) agkeVar).d;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (agkeVar.get(i3) == agkeVar2.get(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        if (!h() || this.d) {
            return;
        }
        j(byteBuffer);
    }

    public final boolean g() {
        return this.d && ((buj) this.b.get(i())).i() && !this.c[i()].hasRemaining();
    }

    public final boolean h() {
        return !this.b.isEmpty();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
