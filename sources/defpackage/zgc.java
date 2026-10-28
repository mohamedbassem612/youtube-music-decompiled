package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.AppCompatEditText;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zgc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zgc(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, zgf] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.lang.Object, tng] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, tng] */
    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.Object, vxe] */
    @Override // java.lang.Runnable
    public final void run() {
        xxj xxjVar;
        int i = 2;
        int i2 = 1;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                zge zgeVarD = ((hno) this.b).e.d();
                long j = zgeVarD.a;
                if (j != -1) {
                    long j2 = zgeVarD.b;
                    if (j2 != -1) {
                        long j3 = zgeVarD.c;
                        if (j3 != -1) {
                            long j4 = zgeVarD.d;
                            if (j4 != -1) {
                                ((zgj) this.a).d.a.h("used." + j + '.' + j2 + ";avail." + j3 + '.' + j4 + ';' + zgeVarD.e);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object obj = this.b;
                Object obj2 = this.a;
                try {
                    zcf zcfVar = ((zcn) obj2).a;
                    if (zcfVar.W) {
                        return;
                    }
                    long j5 = ((zcn) obj2).b;
                    if (j5 <= 0 || (xxjVar = ((zcn) obj2).c) == null) {
                        return;
                    }
                    Object obj3 = xxjVar.a;
                    ((yyv) obj3).L.execute(afwl.i(new spu((yyv) obj3, zcfVar, (zgi) obj, j5, 3)));
                    return;
                } catch (RuntimeException e) {
                    zcn zcnVar = (zcn) obj2;
                    zcnVar.b = 0L;
                    zhv zhvVar = new zhv("player.exception");
                    zhvVar.e(0L);
                    zhvVar.d = e;
                    zhvVar.c = "c.StuckPlaybackListener";
                    zcnVar.a.Z.k(zhvVar.a());
                    return;
                }
            case 2:
                Object obj4 = this.b;
                zjj zjjVar = (zjj) this.a;
                ConcurrentHashMap concurrentHashMap = zjjVar.f;
                zjjVar.aU(zjjVar.b, (tas) ((Pair) concurrentHashMap.get(obj4)).first, ((Long) ((Pair) ((Pair) concurrentHashMap.get(obj4)).second).first).longValue(), ((Long) ((Pair) ((Pair) concurrentHashMap.get(obj4)).second).second).longValue());
                concurrentHashMap.remove(obj4);
                return;
            case 3:
                ((zkt) this.b).removeView((View) this.a);
                return;
            case 4:
                ((zkt) this.b).removeView((View) this.a);
                return;
            case 5:
                Object obj5 = this.a;
                try {
                    this.b.invoke();
                    ((aqi) obj5).b(null);
                    return;
                } catch (Throwable th) {
                    ((aqi) obj5).d(th);
                    return;
                }
            case 6:
                int i3 = zpk.a;
                new Handler(Looper.getMainLooper()).post(new zgc(this.b, this.a, 7, bArr));
                return;
            case 7:
                Object obj6 = this.b;
                int i4 = zpk.a;
                int i5 = Build.VERSION.SDK_INT;
                zoz zozVar = (zoz) obj6;
                int lineCount = zozVar.getLineCount();
                if (i5 >= 29 && ((AppCompatEditText) obj6).getText().length() == 0) {
                    lineCount = zow.a((EditText) obj6);
                }
                Object obj7 = this.a;
                int lineHeight = zozVar.getLineHeight();
                int i6 = zpg.H;
                fhd fhdVar = (fhd) obj7;
                if (fhdVar.c != null) {
                    fhdVar.z(new aero(0, new Object[]{Integer.valueOf(lineCount), Integer.valueOf(lineHeight)}), "updateState:SuggestEditableText.remeasureForUpdatedText");
                    return;
                }
                return;
            case 8:
                Object obj8 = this.b;
                Object obj9 = this.a;
                zqa zqaVar = (zqa) obj9;
                String str = (String) obj8;
                zqaVar.c = str;
                gtg gtgVar = new gtg(obj9, 12);
                byte[] bArr2 = vzh.b;
                aaqf aaqfVar = zqaVar.e;
                zqb zqbVar = new zqb(aaqfVar, str);
                zqbVar.o(bArr2);
                taf.i(((wnh) aaqfVar.e).b(zqbVar, aaqfVar.c, null), MoreExecutors.directExecutor(), new ztb(i2), new yqj(gtgVar, i), null);
                return;
            case 9:
                Object obj10 = this.b;
                zst zstVar = (zst) this.a;
                zug zugVar = (zug) obj10;
                aihf aihfVarR = zstVar.r(zugVar);
                if (aihfVarR != null) {
                    zstVar.t(zvb.e(zugVar.q), aihfVarR);
                    return;
                }
                return;
            case 10:
                ((ztk) this.a).n((aihf) this.b);
                return;
            case 11:
                ((zvx) this.a).b.a(this.b);
                return;
            case 12:
                aihf aihfVar = (aihf) this.b;
                jrh jrhVar = (jrh) aihfVar.instance;
                int i7 = jrhVar.l;
                String str2 = jrhVar.e;
                ((zxc) this.a).c((jrh) aihfVar.build());
                return;
            case 13:
                this.b.jj(new zxa("Invalid URI ".concat(String.valueOf(String.valueOf(this.a)))));
                return;
            case 14:
                try {
                    Object obj11 = this.b;
                    tfq tfqVar = ((zxj) obj11).f;
                    if (tfqVar.h() && (!((zxj) obj11).c.i() || !tfqVar.j(0))) {
                        ((zxj) obj11).b.a(Optional.of(this.a));
                        return;
                    }
                    ((zxj) obj11).b.e((zxf) this.a);
                    anhb anhbVar = ((zxj) obj11).d.a().j;
                    if (anhbVar == null) {
                        anhbVar = anhb.a;
                    }
                    ajbj ajbjVar = anhbVar.r;
                    if (ajbjVar == null) {
                        ajbjVar = ajbj.a;
                    }
                    if (ajbjVar.b) {
                        ((zxj) obj11).e.c.d("ping_flush_one_off", zxp.a, 1, 1, false, null, zxp.b, false);
                        return;
                    }
                    return;
                } catch (tmg e2) {
                    ((agrc) ((agrc) ((agrc) zxj.a.b()).j(e2)).k("com/google/android/libraries/youtube/net/ping/HttpPingService$1", "run", (char) 268, "HttpPingService.java")).w("Auth failure occurs when storing offline request: %s", e2.getLocalizedMessage());
                    return;
                }
            case 15:
                this.b.jj(new zxa(((tmg) this.a).getMessage()));
                return;
            case 16:
                ((agfa) ((zzs) this.a).a).a.e(this.b, null);
                return;
            case 17:
                ((abqq) this.a).a.b(((ajcs) this.b).h);
                return;
            case 18:
                Object obj12 = this.a;
                Map map = ((aaaj) obj12).b;
                synchronized (map) {
                    acjx acjxVar = (acjx) map.get(this.b);
                    if (acjxVar != null) {
                        ((aaaj) obj12).a.iM(acjxVar);
                    }
                    break;
                }
                return;
            case 19:
                aacd aacdVar = (aacd) this.b;
                if (aacdVar.b.a(aacb.REGISTRATION_FORCED) == 3) {
                    aacdVar.g((aacc) aacd.a.apply(this.a));
                    return;
                }
                return;
            default:
                aaco aacoVar = (aaco) this.a;
                aanb aanbVar = (aanb) aacoVar.d.io();
                String strD = aanbVar.d();
                String str3 = (String) this.b;
                if (str3.equals(strD)) {
                    ((aapr) aacoVar.e.io()).c(str3, aanbVar.b());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zgc(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public zgc(Object obj, String str, int i) {
        this.$cid = i;
        this.b = str;
        this.a = obj;
    }

    public zgc(zxj zxjVar, zxf zxfVar, int i) {
        this.$cid = i;
        this.a = zxfVar;
        this.b = zxjVar;
    }
}
