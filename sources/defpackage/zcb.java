package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zcb implements yoe {
    public static final /* synthetic */ int d = 0;
    public final yod a;
    public final abfv b;
    public final abfv c;

    static {
        new zcb(yod.a, zjb.e, zjb.d);
    }

    public zcb(yod yodVar, abfv abfvVar, abfv abfvVar2) {
        if (yodVar == null) {
            throw new NullPointerException("Null streamSelectionResult");
        }
        this.a = yodVar;
        if (abfvVar == null) {
            throw new NullPointerException("Null candidateAudioItags");
        }
        this.c = abfvVar;
        if (abfvVar2 == null) {
            throw new NullPointerException("Null candidateVideoItags");
        }
        this.b = abfvVar2;
    }

    @Override // defpackage.yoe
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.yoe
    public final yog b() {
        return this.a.b();
    }

    @Override // defpackage.yoe
    public final yog c() {
        return this.a.g;
    }

    @Override // defpackage.yoe
    public final String d() {
        return this.a.d();
    }

    @Override // defpackage.yoe
    public final String e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcb) {
            zcb zcbVar = (zcb) obj;
            if (this.a.equals(zcbVar.a) && this.c.equals(zcbVar.c) && this.b.equals(zcbVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yoe
    public final ArrayList f() {
        return this.a.f();
    }

    @Override // defpackage.yoe
    public final ArrayList g() {
        return this.a.g();
    }

    @Override // defpackage.yoe
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    @Override // defpackage.yoe
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.yoe
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.yoe
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.yoe
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.yoe
    public final wgo[] m() {
        return this.a.f;
    }

    @Override // defpackage.yoe
    public final wiw[] o() {
        return this.a.e;
    }

    public final String toString() {
        abfv abfvVar = this.b;
        abfv abfvVar2 = this.c;
        return "ClientFormatSelectionResult{streamSelectionResult=" + String.valueOf(this.a) + ", candidateAudioItags=" + abfvVar2.toString() + ", candidateVideoItags=" + abfvVar.toString() + '}';
    }

    public zcb() {
        throw null;
    }
}
