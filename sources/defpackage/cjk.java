package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cjk extends Handler {
    final /* synthetic */ cjo a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjk(cjo cjoVar, Looper looper) {
        super(looper);
        this.a = cjoVar;
    }

    final void a(int i, Object obj, boolean z) {
        obtainMessage(i, new cjl(cnd.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
    }

    public final synchronized void b() {
        removeCallbacksAndMessages(null);
        this.b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.CharSequence] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        Object cjnVar;
        Object objP;
        ?? r6;
        String str;
        Object obj;
        cjl cjlVar = (cjl) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                ckm ckmVar = this.a.d;
                eol eolVar = (eol) cjlVar.d;
                byte[] bArrL = afxw.L("{\"signedRequest\":\"".getBytes(StandardCharsets.UTF_8), (byte[]) eolVar.a, "\"}".getBytes(StandardCharsets.UTF_8));
                objP = aup.p(((byl) ((ckj) ckmVar).a).a(), (String) eolVar.b, bArrL, agkj.k("Content-Type", ahbi.b.toString(), "Content-Length", String.valueOf(bArrL.length)));
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                cjo cjoVar = this.a;
                ckm ckmVar2 = cjoVar.d;
                UUID uuid = cjoVar.e;
                eol eolVar2 = (eol) cjlVar.d;
                ?? r7 = eolVar2.a;
                if (true == TextUtils.isEmpty(r7)) {
                    r6 = r7;
                    r6 = 0;
                }
                r6 = r7;
                if (TextUtils.isEmpty(r6)) {
                    byh byhVar = new byh();
                    byhVar.a = Uri.EMPTY;
                    throw new ckn(byhVar.a(), Uri.EMPTY, agpn.b, 0L, new IllegalStateException("No license URL"));
                }
                HashMap map = new HashMap();
                UUID uuid2 = brt.e;
                if (uuid2.equals(uuid)) {
                    str = "text/xml";
                } else {
                    str = brt.c.equals(uuid) ? "application/json" : "application/octet-stream";
                }
                map.put("Content-Type", str);
                if (uuid2.equals(uuid)) {
                    map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
                }
                Map map2 = ((ckj) ckmVar2).b;
                synchronized (map2) {
                    try {
                        map.putAll(map2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                eol eolVarP = aup.p(((byl) ((ckj) ckmVar2).a).a(), (String) r6, (byte[]) eolVar2.b, map);
                cjo cjoVar2 = this.a;
                synchronized (cjoVar2.g) {
                    aaf aafVar = cjoVar2.k;
                    if (aafVar != null && (obj = eolVarP.b) != null) {
                        cnc cncVar = new cnc((cnd) obj);
                        cncVar.a = cjlVar.a;
                        cncVar.f = SystemClock.elapsedRealtime() - cjlVar.c;
                        aafVar.d(new cnd(cncVar));
                    }
                }
                objP = eolVarP;
            }
        } catch (ckn e) {
            cjl cjlVar2 = (cjl) message.obj;
            objP = e;
            if (cjlVar2.b) {
                int i2 = cjlVar2.e + 1;
                cjlVar2.e = i2;
                cjo cjoVar3 = this.a;
                crj crjVar = cjoVar3.c;
                if (i2 <= crjVar.a(3)) {
                    cnc cncVar2 = new cnc(cjlVar2.a, e.a, SystemClock.elapsedRealtime());
                    cncVar2.d = e.b;
                    cncVar2.e = e.c;
                    cncVar2.f = SystemClock.elapsedRealtime() - cjlVar2.c;
                    cncVar2.g = e.d;
                    cnd cndVar = new cnd(cncVar2);
                    if (e.getCause() instanceof IOException) {
                        objP = e;
                        cjnVar = (IOException) e.getCause();
                    } else {
                        objP = e;
                        cjnVar = new cjn(e.getCause());
                    }
                    long jC = crjVar.c(new aae(cndVar, cjnVar, cjlVar2.e));
                    objP = e;
                    if (jC != -9223372036854775807L) {
                        synchronized (cjoVar3.g) {
                            aaf aafVar2 = cjoVar3.k;
                            if (aafVar2 != null) {
                                aafVar2.d(cndVar);
                            }
                            synchronized (this) {
                                if (!this.b) {
                                    sendMessageDelayed(Message.obtain(message), jC);
                                    return;
                                }
                                objP = e;
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            bvx.f("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            objP = e2;
        }
        objP = e;
        long j = cjlVar.a;
        synchronized (this) {
            if (!this.b) {
                this.a.f.obtainMessage(message.what, Pair.create(cjlVar.d, objP)).sendToTarget();
            }
        }
    }
}
