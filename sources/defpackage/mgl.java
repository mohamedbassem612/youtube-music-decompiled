package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.util.OptionalInt;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgl implements nrw {
    private final /* synthetic */ int $cid;
    public final Object a;

    public mgl(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        switch (this.$cid) {
            case 0:
                return asqv.b;
            case 1:
                return akls.b;
            case 2:
                return aowo.b;
            case 3:
                return asst.b;
            case 4:
                return apxp.b;
            case 5:
                return asqw.b;
            case 6:
                return asqx.b;
            default:
                return asok.b;
        }
    }

    @Override // defpackage.nrx
    public final aslz b() {
        switch (this.$cid) {
            case 0:
                return rpi.A();
            case 1:
                return a.r();
            case 2:
                return a.r();
            case 3:
                return a.r();
            case 4:
                return a.r();
            case 5:
                return a.r();
            case 6:
                return a.r();
            default:
                return a.r();
        }
    }

    /* JADX WARN: Type inference failed for: r10v81, types: [aunn, java.lang.Object] */
    @Override // defpackage.nrw
    public final /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        int millis;
        Duration durationOfSeconds;
        switch (this.$cid) {
            case 0:
                return avlb.n(new mgd((Object) this, obj, (Object) nrvVar, 3, (byte[]) null));
            case 1:
                akls aklsVar = (akls) obj;
                mfv mfvVarA = mfx.a();
                mfvVarA.o = 1;
                int i = aklsVar.c;
                if ((i & 4) != 0) {
                    mfvVarA.a = aklsVar.e;
                }
                if ((i & 8) != 0) {
                    mfvVarA.b = aklsVar.f;
                }
                if ((i & 16) != 0) {
                    mfvVarA.c = aklsVar.g;
                }
                if ((i & 64) != 0) {
                    CommandOuterClass$Command defaultInstance = aklsVar.i;
                    if (defaultInstance == null) {
                        defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                    }
                    mfvVarA.e = defaultInstance;
                }
                int i2 = aklsVar.c;
                if ((i2 & 32) != 0) {
                    mfvVarA.d = aklsVar.h;
                }
                if ((i2 & SemanticState.Focused) != 0) {
                    CommandOuterClass$Command defaultInstance2 = aklsVar.j;
                    if (defaultInstance2 == null) {
                        defaultInstance2 = CommandOuterClass$Command.getDefaultInstance();
                    }
                    mfvVarA.f = defaultInstance2;
                }
                akrl akrlVar = aklsVar.l;
                if (akrlVar == null) {
                    akrlVar = akrl.a;
                }
                if ((akrlVar.b & 4) != 0) {
                    akrl akrlVar2 = aklsVar.l;
                    if (akrlVar2 == null) {
                        akrlVar2 = akrl.a;
                    }
                    mfvVarA.n = akrlVar2.d;
                }
                if ((aklsVar.c & SemanticState.Hidden) != 0) {
                    mfvVarA.k = Boolean.valueOf(aklsVar.k);
                }
                mfvVarA.g = nrvVar;
                return avlb.n(new mgd(this, aklsVar, mfvVarA, 0, (short[]) null)).v(avmh.a());
            case 2:
                aowo aowoVar = (aowo) obj;
                View viewB = nrvVar.b();
                return ((aowoVar.c & 1) == 0 || viewB == null) ? avlb.e() : avlb.n(new mgd(this, aowoVar, viewB, 4, (short[]) null)).v(avmh.a());
            case 3:
                asst asstVar = (asst) obj;
                int i3 = asstVar.c;
                if ((i3 & 1) == 0) {
                    return avlb.e();
                }
                if ((i3 & 8) != 0) {
                    double d = asstVar.f;
                    Duration duration = ahbt.a;
                    if (d >= 9.223372036854776E18d) {
                        durationOfSeconds = ahbt.b;
                    } else if (d <= -9.223372036854776E18d) {
                        durationOfSeconds = ahbt.a;
                    } else {
                        long jB = ahbd.b(d, RoundingMode.FLOOR);
                        durationOfSeconds = Duration.ofSeconds(jB, ahbd.b((d - jB) * 1.0E9d, RoundingMode.FLOOR));
                    }
                    millis = (int) durationOfSeconds.toMillis();
                } else {
                    millis = 0;
                }
                return avlb.n(new mkb(this, asstVar, millis, nrvVar, 1)).v(avmh.a());
            case 4:
                apxp apxpVar = (apxp) obj;
                View viewB2 = nrvVar.b();
                int i4 = apxpVar.c;
                if ((i4 & 1) == 0 || viewB2 == null) {
                    return avlb.e();
                }
                OptionalInt optionalIntOf = (i4 & 4) != 0 ? OptionalInt.of(apxpVar.e) : OptionalInt.empty();
                OptionalInt optionalIntOf2 = (apxpVar.c & 8) != 0 ? OptionalInt.of(apxpVar.f) : OptionalInt.empty();
                OptionalInt optionalIntOf3 = (apxpVar.c & 16) != 0 ? OptionalInt.of(apxpVar.g) : OptionalInt.empty();
                if ((apxpVar.c & 32) != 0) {
                    ((acyj) this.a).b = apxpVar.h;
                }
                return avlb.n(new vav(this, apxpVar, viewB2, optionalIntOf, optionalIntOf2, optionalIntOf3, 1)).v(avmh.a());
            case 5:
                asqw asqwVar = (asqw) obj;
                return (asqwVar == null || (asqwVar.c & 1) == 0) ? avlb.m(new nud("Invalid StartDisplaySyncCommand.")) : avlb.n(new mgd((Object) this, (Object) asqwVar, (Object) nrvVar, 5, (byte[]) null)).v(avmh.a());
            case 6:
                return avlb.n(new mgd((Object) this, obj, (Object) nrvVar, 6, (byte[]) null));
            default:
                asok asokVar = (asok) obj;
                nry nryVar = (nry) this.a.io();
                if (asokVar.c.size() <= 0) {
                    return avlb.e();
                }
                avpo avpoVar = new avpo(avlh.B(asokVar.c).H(new hpn(nryVar, nrvVar, 5, null)));
                avnn avnnVar = atqp.p;
                return avpoVar;
        }
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return nqw.a(this, mewVar, nrvVar);
    }
}
