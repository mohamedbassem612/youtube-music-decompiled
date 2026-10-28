package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class vot {
    public final String a;
    public final vob b;
    public int c = 0;
    public final vok d = vok.a;
    public ajwo e;
    private final vxz f;

    public vot(String str, vob vobVar, vxz vxzVar) {
        this.f = vxzVar;
        this.a = str;
        this.b = vobVar;
    }

    private final void c() {
        int i = this.c;
        if (i == 1) {
            this.b.d(this.e);
        } else if (i == 2) {
            this.b.ad(this.e);
        } else if (i == 3) {
            this.b.ab();
        } else if (i == 4) {
            this.b.aa();
        } else if (i == 5) {
            this.b.e();
        }
        a();
    }

    public final void a() {
        vny vnyVarT = this.b.T();
        if (vnyVarT != null) {
            int i = this.c;
            if (i == 2) {
                vnyVarT.g();
                return;
            }
            if (i == 3) {
                vnyVarT.f();
            } else if (i == 4) {
                vnyVarT.d();
            } else if (i == 5) {
                vnyVarT.e();
            }
        }
    }

    public void b(int i) {
        if (i == 5) {
            int i2 = this.c;
            if (i2 == 0) {
                return;
            }
            if (i2 == 1) {
                this.c = 5;
                c();
                return;
            }
        }
        while (true) {
            int i3 = this.c;
            if (i3 == i) {
                return;
            }
            if (i > i3) {
                boolean zM = this.f.m(32, 45722330L);
                int i4 = this.c;
                if (!zM) {
                    ahno.O(i4 < 5);
                } else if (i4 == 5) {
                    return;
                }
                this.c++;
                c();
            } else if (i < i3) {
                boolean zM2 = this.f.m(32, 45722330L);
                int i5 = this.c;
                if (!zM2) {
                    ahno.O(i5 < 5);
                } else if (i5 == 5) {
                    return;
                }
                int i6 = this.c;
                if (i6 <= 2) {
                    return;
                }
                if (i6 == 4) {
                    i6 = 3;
                }
                this.c = i6 - 1;
                c();
            } else {
                continue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vot)) {
            return false;
        }
        vot votVar = (vot) obj;
        return Objects.equals(this.a, votVar.a) && Objects.equals(this.b, votVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
