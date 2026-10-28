package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hpc implements Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ hpc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Type inference failed for: r2v6, types: [acjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.time.temporal.Temporal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, twh] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z;
        int i;
        int i2 = 0;
        switch (this.$cid) {
            case 0:
                String strH = wfs.h((String) obj);
                Object obj2 = this.a;
                return ahno.ar(((hpd) obj2).g(strH), new hnd(obj2, 7), MoreExecutors.directExecutor());
            case 1:
                adts adtsVar = (adts) obj;
                Object obj3 = this.a;
                grf grfVar = (grf) obj3;
                if (grfVar.ay != null) {
                    agev agevVar = adtsVar.b;
                    z = agevVar.g() && Objects.equals(agevVar.c().c(), grfVar.ay.c());
                }
                if (!grfVar.isHidden() && ((cc) obj3).getView() != null && adtsVar.a() && grfVar.af() && !z) {
                    grfVar.ad(false);
                }
                iya iyaVarD = iyb.d();
                iyaVarD.b(adtsVar);
                iyaVarD.d(adtsVar.a() ? hks.a.toMillis() : 0L);
                iyaVarD.c(adtsVar.a());
                return iyaVarD.a();
            case 2:
                File file = (File) obj;
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        int length = (int) file.length();
                        byte[] bArr = new byte[length];
                        do {
                            i = fileInputStream.read(bArr, i2, length - i2);
                            i2 += i;
                        } while (i != 0);
                        long[] jArrAx = tym.ax(bArr);
                        fileInputStream.close();
                        return jArrAx;
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    return null;
                } catch (Throwable unused2) {
                    tym.n(file, this.a);
                    return null;
                }
            case 3:
                asji asjiVar = (asji) obj;
                aihl aihlVarCheckIsLite = aihn.checkIsLite((aigw) this.a);
                asjiVar.c(aihlVarCheckIsLite);
                Object objK = asjiVar.j.k(aihlVarCheckIsLite.d);
                return objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK);
            case 4:
                return ((hhb) this.a).j((zwa) obj);
            case 5:
                return ((xip) this.a).h();
            case 6:
                atph atphVar = (atph) obj;
                aijp aijpVar = atphVar.c;
                if (aijpVar == null) {
                    aijpVar = aijp.a;
                }
                Duration durationBetween = Duration.between(ahng.ax(aijpVar), this.a);
                int iAS = a.aS(atphVar.d);
                if (iAS == 0) {
                    iAS = 1;
                }
                aihf aihfVarCreateBuilder = amyp.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amyp amypVar = (amyp) aihfVarCreateBuilder.instance;
                amypVar.d = iAS - 1;
                amypVar.b |= 2;
                aigu aiguVarAu = ahng.au(durationBetween);
                aihfVarCreateBuilder.copyOnWrite();
                amyp amypVar2 = (amyp) aihfVarCreateBuilder.instance;
                aiguVarAu.getClass();
                amypVar2.c = aiguVarAu;
                amypVar2.b |= 1;
                return (amyp) aihfVarCreateBuilder.build();
            case 7:
                return ((ytv) this.a.io()).h((String) obj);
            case 8:
                return ((abxv) this.a).i((String) obj);
            case 9:
                ygk ygkVar = (ygk) obj;
                return zik.bt(((ygl) this.a).c, zik.co(ygkVar.a, ygkVar.b), ygkVar.c);
            default:
                return new ci(this.a, (byte[]) null);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }
}
