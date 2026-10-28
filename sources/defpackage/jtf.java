package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$LicenseResponse;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class jtf extends Handler {
    private final ywn a;
    private final boolean b;
    private final ckm c;
    private final jtg d;
    private final int e;
    private final int f;

    public jtf(Looper looper, ywn ywnVar, boolean z, ckm ckmVar, jtg jtgVar, int i, int i2) {
        super(looper);
        this.a = ywnVar;
        this.b = z;
        this.c = ckmVar;
        this.d = jtgVar;
        this.e = i;
        this.f = i2;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0243  */
    /* JADX WARN: Code duplicated, block: B:67:0x0248  */
    /* JADX WARN: Code duplicated, block: B:72:0x0256  */
    /* JADX WARN: Code duplicated, block: B:74:0x025a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0285  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        Object eolVar;
        int i;
        int i2;
        int i3;
        zhz zhzVarA;
        yvl yvlVar;
        yvm yvmVar;
        try {
            int i4 = message.what;
            if (i4 == 0) {
                ckm ckmVar = this.c;
                eol eolVar2 = (eol) message.obj;
                try {
                    Uri uri = Uri.parse((String) eolVar2.b);
                    aaqc aaqcVar = ((yvk) ckmVar).p;
                    Object obj2 = eolVar2.a;
                    String str = ((yvk) ckmVar).c;
                    taq.c();
                    tyt tytVar = new tyt(uri);
                    tytVar.f("signedRequest", new String((byte[]) obj2));
                    tytVar.f("cpn", str);
                    ((abuz) aaqcVar.e).g(str, tytVar);
                    Uri uriA = tytVar.a();
                    zyz zyzVar = new zyz();
                    yvp yvpVar = new yvp(uriA.toString(), zyzVar);
                    if (((zhl) aaqcVar.d).cI()) {
                        yvpVar.B(tok.WIDEVINE_LICENSE_SERVICE_PROVISIONING_REQUEST);
                    }
                    aaqcVar.e().b(yvpVar);
                    try {
                        eolVar = new eol((byte[]) zyzVar.get());
                    } catch (InterruptedException e) {
                        throw new yvl(e, true);
                    } catch (ExecutionException e2) {
                        throw new yvl(e2.getCause(), true);
                    }
                } catch (yvl e3) {
                    byh byhVar = new byh();
                    byhVar.b((String) eolVar2.b);
                    byhVar.e = (byte[]) eolVar2.a;
                    byi byiVarA = byhVar.a();
                    throw new ckn(byiVarA, byiVarA.a, agpn.b, 0L, e3);
                }
            } else {
                if (i4 != 1) {
                    throw new RuntimeException();
                }
                ckm ckmVar2 = this.c;
                eol eolVar3 = (eol) message.obj;
                try {
                    AtomicInteger atomicInteger = ((yvk) ckmVar2).b;
                    int i5 = atomicInteger.get();
                    aaqc aaqcVar2 = ((yvk) ckmVar2).p;
                    Object obj3 = eolVar3.b;
                    String str2 = ((yvk) ckmVar2).i;
                    zkf.d(str2);
                    String strZ = ahno.Z(((yvk) ckmVar2).c);
                    boolean zContains = ((yvk) ckmVar2).e.contains(ywp.DRM_SDR_FALLBACK);
                    int i6 = ((yvk) ckmVar2).n;
                    boolean z = ((yvk) ckmVar2).o;
                    String strA = ((yvk) ckmVar2).g;
                    zkf.d(strA);
                    String str3 = ((yvk) ckmVar2).h;
                    zkf.d(str3);
                    Integer num = ((yvk) ckmVar2).k;
                    byte[] bArr = ((yvk) ckmVar2).d;
                    zkf.c(!str3.isEmpty());
                    taq.c();
                    if (TextUtils.isEmpty(strA)) {
                        strA = ((txp) aaqcVar2.g).a();
                    }
                    try {
                        yvn yvnVar = new yvn((InnertubeDrmService$LicenseResponse) ((wnh) ((dov) aaqcVar2.f).a).c(new yvo(aaqcVar2.b, aaqcVar2.c, (byte[]) obj3, str2, strZ, zContains, i6, z, strA, str3, ((zhl) aaqcVar2.d).j.m(303, 45728592L), num, bArr)));
                        if (!yvnVar.c()) {
                            throw new yvl(yvnVar);
                        }
                        ((yvk) ckmVar2).j = yvnVar.b;
                        InnertubeDrmService$LicenseResponse innertubeDrmService$LicenseResponse = yvnVar.a;
                        boolean z2 = innertubeDrmService$LicenseResponse.h;
                        if (i5 == atomicInteger.get()) {
                            agke agkeVar = ((yvk) ckmVar2).j;
                            ahey aheyVar = ((yvk) ckmVar2).l;
                            if (aheyVar != null) {
                                yno.S(aheyVar, new qd(ckmVar2, i5, agkeVar, 12, (byte[]) null), 0L, ((yvk) ckmVar2).f, ((yvk) ckmVar2).m, "Failed to fetch License Response.");
                            }
                        }
                        eolVar = new eol(innertubeDrmService$LicenseResponse.f.G());
                    } catch (wno e4) {
                        throw new yvl(e4, false);
                    }
                } catch (yvl e5) {
                    byh byhVar2 = new byh();
                    byhVar2.b((String) eolVar3.a);
                    byhVar2.e = (byte[]) eolVar3.b;
                    byi byiVarA2 = byhVar2.a();
                    throw new ckn(byiVarA2, byiVarA2.a, agpn.b, 0L, e5);
                }
            }
        } catch (ckn e6) {
            if (!(e6.getCause() instanceof yvl) || (yvmVar = (yvlVar = (yvl) e6.getCause()).a) == null || yvmVar.c()) {
                obj = e6;
                if (message.arg1 == 1) {
                    i = message.arg2;
                    i2 = i + 1;
                    i3 = this.e;
                    if (i3 >= 0 || message.what != 1 || i2 <= i3) {
                        obj = e6;
                        obj = e6;
                        if (i2 <= this.f) {
                            Message messageObtain = Message.obtain(message);
                            messageObtain.arg2 = i2;
                            sendMessageDelayed(messageObtain, Math.min(i * 1000, 5000));
                            zhv zhvVar = new zhv("");
                            zhvVar.b = zhw.e;
                            zhvVar.d = e6;
                            zhzVarA = zhvVar.a();
                            if (e6.getCause() instanceof yvl) {
                                zhzVarA = yvq.b((yvl) e6.getCause(), Optional.empty());
                            }
                            ywn ywnVar = this.a;
                            zhzVarA.p();
                            ywnVar.k(zhzVarA);
                            return;
                        }
                    }
                }
            } else {
                int iAS = a.aS(((yvn) yvmVar).a.c);
                if (iAS == 0 || iAS == 1) {
                    ywn ywnVar2 = this.a;
                    zhv zhvVar2 = new zhv("status");
                    zhvVar2.b = zhw.e;
                    zhvVar2.d = yvlVar;
                    zhvVar2.e = false;
                    ywnVar2.k(zhvVar2.a());
                }
                obj = e6;
                if (this.b) {
                    obj = e6;
                    if (message.arg1 == 1) {
                        i = message.arg2;
                        i2 = i + 1;
                        i3 = this.e;
                        if (i3 >= 0) {
                            obj = e6;
                            obj = e6;
                            if (i2 <= this.f) {
                                Message messageObtain2 = Message.obtain(message);
                                messageObtain2.arg2 = i2;
                                sendMessageDelayed(messageObtain2, Math.min(i * 1000, 5000));
                                zhv zhvVar3 = new zhv("");
                                zhvVar3.b = zhw.e;
                                zhvVar3.d = e6;
                                zhzVarA = zhvVar3.a();
                                if (e6.getCause() instanceof yvl) {
                                    zhzVarA = yvq.b((yvl) e6.getCause(), Optional.empty());
                                }
                                ywn ywnVar3 = this.a;
                                zhzVarA.p();
                                ywnVar3.k(zhzVarA);
                                return;
                            }
                        } else {
                            obj = e6;
                            obj = e6;
                            if (i2 <= this.f) {
                                Message messageObtain3 = Message.obtain(message);
                                messageObtain3.arg2 = i2;
                                sendMessageDelayed(messageObtain3, Math.min(i * 1000, 5000));
                                zhv zhvVar4 = new zhv("");
                                zhvVar4.b = zhw.e;
                                zhvVar4.d = e6;
                                zhzVarA = zhvVar4.a();
                                if (e6.getCause() instanceof yvl) {
                                    zhzVarA = yvq.b((yvl) e6.getCause(), Optional.empty());
                                }
                                ywn ywnVar4 = this.a;
                                zhzVarA.p();
                                ywnVar4.k(zhzVarA);
                                return;
                            }
                        }
                    }
                }
            }
            eolVar = obj;
        } catch (Exception e7) {
            Log.w("YTDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e7);
            obj = e7;
            eolVar = obj;
        }
        this.d.obtainMessage(message.what, Pair.create(message.obj, eolVar)).sendToTarget();
    }
}
