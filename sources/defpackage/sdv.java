package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sdv implements sds {
    protected final Context a;
    protected final agfr b;
    final boolean c;
    protected final sdu d;
    public final boolean e;
    private final String f;

    public sdv(Context context, String str, final ajbd ajbdVar, final vwt vwtVar, boolean z, final tqj tqjVar, abxu abxuVar) {
        str.getClass();
        vwtVar.getClass();
        context.getClass();
        this.a = context;
        this.c = z;
        this.d = new sdu((Executor) abxuVar.u().f, (Executor) abxuVar.u().c);
        int i = tqr.a;
        this.e = tqjVar.k(1073813997);
        final String strConcat = "a.".concat(str);
        this.f = strConcat;
        this.b = aguu.al(new agfr() { // from class: sdt
            @Override // defpackage.agfr
            public final Object io() {
                ajbd ajbdVar2 = ajbdVar;
                long jA = ajbdVar2 == null ? -1L : ajbdVar2.k;
                tqj tqjVar2 = tqjVar;
                int i2 = tqr.a;
                if (tqjVar2.k(1073808284)) {
                    jA = tqjVar2.a(1073873822);
                }
                boolean zK = tqjVar2.k(1073808281);
                int i3 = jA == 2 ? 3 : 2;
                if (zK) {
                    i3 = 3;
                }
                String str2 = strConcat;
                aihf aihfVarCreateBuilder = fwz.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                fwz fwzVar = (fwz) aihfVarCreateBuilder.instance;
                fwzVar.c = i3 - 1;
                fwzVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                fwz fwzVar2 = (fwz) aihfVarCreateBuilder.instance;
                fwzVar2.b |= 2;
                fwzVar2.d = !zK;
                aihfVarCreateBuilder.copyOnWrite();
                fwz fwzVar3 = (fwz) aihfVarCreateBuilder.instance;
                fwzVar3.b |= 4;
                fwzVar3.e = str2;
                aihfVarCreateBuilder.copyOnWrite();
                fwz fwzVar4 = (fwz) aihfVarCreateBuilder.instance;
                fwzVar4.b |= 16;
                int i4 = 0;
                fwzVar4.g = false;
                if (tqjVar2.k(1073807934)) {
                    aihf aihfVarCreateBuilder2 = fxc.a.createBuilder();
                    boolean zK2 = tqjVar2.k(1073807925);
                    aihfVarCreateBuilder2.copyOnWrite();
                    fxc fxcVar = (fxc) aihfVarCreateBuilder2.instance;
                    fxcVar.b |= 4;
                    fxcVar.e = zK2;
                    boolean zK3 = tqjVar2.k(1073807926);
                    aihfVarCreateBuilder2.copyOnWrite();
                    fxc fxcVar2 = (fxc) aihfVarCreateBuilder2.instance;
                    fxcVar2.b |= 16;
                    fxcVar2.g = zK3;
                    if (tqjVar2.a(1073873463) == 1) {
                        i4 = 100;
                    } else if (tqjVar2.a(1073873463) == 2) {
                        i4 = 2500;
                    } else if (tqjVar2.a(1073873463) == 3) {
                        i4 = 5;
                    }
                    if (i4 != 0) {
                        aihfVarCreateBuilder2.copyOnWrite();
                        fxc fxcVar3 = (fxc) aihfVarCreateBuilder2.instance;
                        fxcVar3.b |= 2;
                        fxcVar3.d = i4;
                    }
                    aihf aihfVarCreateBuilder3 = fxf.a.createBuilder();
                    boolean zK4 = tqjVar2.k(1073807929);
                    aihfVarCreateBuilder3.copyOnWrite();
                    fxf fxfVar = (fxf) aihfVarCreateBuilder3.instance;
                    fxfVar.b |= 2;
                    fxfVar.d = zK4;
                    int iAm = tym.am(tqjVar2);
                    if (iAm != 0) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        fxf fxfVar2 = (fxf) aihfVarCreateBuilder3.instance;
                        fxfVar2.b |= 1;
                        fxfVar2.c = iAm;
                    }
                    int iAl = tym.al(tqjVar2);
                    if (iAl != 0) {
                        aihfVarCreateBuilder3.copyOnWrite();
                        fxf fxfVar3 = (fxf) aihfVarCreateBuilder3.instance;
                        fxfVar3.b |= 16;
                        fxfVar3.e = iAl;
                    }
                    fxc fxcVar4 = (fxc) aihfVarCreateBuilder2.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    fwz fwzVar5 = (fwz) aihfVarCreateBuilder.instance;
                    fxcVar4.getClass();
                    fwzVar5.h = fxcVar4;
                    fwzVar5.b |= 32;
                    fxf fxfVar4 = (fxf) aihfVarCreateBuilder3.build();
                    aihfVarCreateBuilder.copyOnWrite();
                    fwz fwzVar6 = (fwz) aihfVarCreateBuilder.instance;
                    fxfVar4.getClass();
                    fwzVar6.i = fxfVar4;
                    fwzVar6.b |= 64;
                }
                vwt vwtVar2 = vwtVar;
                sdv sdvVar = this.a;
                fwz fwzVar7 = (fwz) aihfVarCreateBuilder.build();
                if (sdvVar.e) {
                    return new heg((Context) vwtVar2.a, sdvVar.d, fwzVar7);
                }
                return new heg((Context) vwtVar2.a, fwzVar7);
            }
        });
    }

    protected static String h(int i) {
        return "go/asr".concat(String.valueOf(String.format(Locale.ROOT, "%02d", Integer.valueOf(i))));
    }

    protected static final boolean j(String str) {
        return str == null || str.length() <= 8;
    }

    @Override // defpackage.sds
    public ListenableFuture a(boolean z) {
        if (!z) {
            return new aher(g());
        }
        qoh qohVar = new qoh(this, 11);
        sdu sduVar = this.d;
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), qohVar, 1));
        sduVar.a.execute(ahfoVar);
        return ahng.o(ahfoVar);
    }

    @Override // defpackage.sds
    public ListenableFuture b() {
        return ahng.o(ahno.ap(new qoh(this, 12), this.d));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jvw] */
    @Override // defpackage.sds
    public final String c(String str) {
        if (this.c) {
            return "";
        }
        try {
            return ((heg) this.b.io()).a.a(new kun(this.a), str);
        } catch (RemoteException unused) {
            return h(15);
        }
    }

    @Override // defpackage.sds
    public String d() {
        return i();
    }

    @Override // defpackage.sds
    public final String e() {
        return "ms";
    }

    @Override // defpackage.sds
    public final String f() {
        return this.f;
    }

    public final Optional g() {
        jwa jwaVarE = null;
        try {
            jwaVarE = jwb.e(this.a);
        } catch (kmj unused) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequester] GooglePlayServicesNotAvailableException. YouTube is not expected to be able to run without Google Play Services");
        } catch (kmk e) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequester] GooglePlayServicesRepairableException: ".concat(String.valueOf(e.getMessage())));
        } catch (Exception e2) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequester] Unexpected unplanned exception: ".concat(String.valueOf(e2.getMessage())));
        }
        return Optional.ofNullable(jwaVarE);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, jvw] */
    public final String i() {
        String strH;
        try {
            String strB = ((heg) this.b.io()).a.b(new kun(this.a));
            if (TextUtils.isEmpty(strB)) {
                strB = h(14);
            } else {
                this.d.b.compareAndSet(false, true);
            }
            return strB;
        } catch (RemoteException unused) {
            strH = h(15);
            return strH;
        } catch (Throwable unused2) {
            strH = h(13);
            return strH;
        }
    }
}
