package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class achd implements achv {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/video/heartbeat/AttestationDecoratingResponseHandler");
    private final Executor d;
    private final achs e;
    private final acqf f;
    private final ek g;
    public int c = 1;
    public Optional b = Optional.empty();

    public achd(ek ekVar, acqf acqfVar, Executor executor) {
        ekVar.getClass();
        this.g = ekVar;
        this.f = acqfVar;
        this.d = executor;
        this.e = new achy(this, 1);
    }

    public static final ajgu a(String str, String str2) {
        aihf aihfVarCreateBuilder = ajgu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        ajgu ajguVar = (ajgu) aihfVarCreateBuilder.instance;
        str.getClass();
        ajguVar.b |= 1;
        ajguVar.e = str;
        if (!ahno.aa(str2)) {
            aihfVarCreateBuilder.copyOnWrite();
            ajgu ajguVar2 = (ajgu) aihfVarCreateBuilder.instance;
            str2.getClass();
            ajguVar2.c = 3;
            ajguVar2.d = str2;
        }
        return (ajgu) aihfVarCreateBuilder.build();
    }

    private final synchronized void h(final aopm aopmVar) {
        try {
            if (aopmVar == null) {
                zvp.a(zvn.b, zvm.k, "HeartbeatAttestationConfig requires attestation, but PlayerAttestationRenderer is null.");
            } else {
                Uri uri = Uri.parse("?".concat(String.valueOf(aopmVar.c)));
                String queryParameter = uri.getQueryParameter("c5a");
                this.c = 2;
                if (aopmVar.d) {
                    taf.i(this.f.b(agpn.b), this.d, new wuy(this, 15), new yqj(this, 14), null);
                } else if (queryParameter != null) {
                    HashMap map = new HashMap();
                    map.put("challenge", aopmVar.c);
                    ktg ktgVar = new ktg() { // from class: achc
                        @Override // defpackage.ktg
                        public final void a(String str) {
                            achd achdVar = this.a;
                            aopm aopmVar2 = aopmVar;
                            synchronized (achdVar) {
                                if (achdVar.c == 2) {
                                    achdVar.b = Optional.of(achd.a(aopmVar2.c, str));
                                    achdVar.c = 3;
                                }
                            }
                        }
                    };
                    String queryParameter2 = uri.getQueryParameter("c5b");
                    ek ekVar = this.g;
                    if (true == ahno.aa(queryParameter2)) {
                        queryParameter2 = "yt_player";
                    }
                    ekVar.f(queryParameter2, map, ktgVar);
                } else {
                    this.b = Optional.of(a(aopmVar.c, ""));
                    this.c = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.achv
    public final int b(achu achuVar) {
        alve alveVar = achuVar.d;
        if (alveVar == null || (alveVar.b & 1) == 0 || !alveVar.c) {
            return 5;
        }
        h(achuVar.e);
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:22:0x002a, B:15:0x001c, B:19:0x0023, B:10:0x0011, B:26:0x0035), top: B:31:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0023 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:22:0x002a, B:15:0x001c, B:19:0x0023, B:10:0x0011, B:26:0x0035), top: B:31:0x0001 }] */
    @Override // defpackage.achv
    public final synchronized int c(achu achuVar) {
        int i;
        alve alveVar = achuVar.d;
        if (alveVar == null || (alveVar.b & 1) == 0) {
            int i2 = this.c;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0 || i3 == 3) {
                this.c = 1;
                this.b = Optional.empty();
            } else {
                i = this.c;
                if (i != 1 || i == 4) {
                    h(achuVar.e);
                }
            }
        } else if (alveVar.c) {
            i = this.c;
            if (i != 1) {
                h(achuVar.e);
            } else {
                h(achuVar.e);
            }
        } else {
            this.c = 1;
            this.b = Optional.empty();
        }
        return 5;
    }

    @Override // defpackage.achv
    public final /* synthetic */ aboe d(alvl alvlVar) {
        return null;
    }

    @Override // defpackage.achv
    public final synchronized aboe e(wno wnoVar) {
        if (this.c == 4) {
            this.c = 3;
        }
        return null;
    }

    @Override // defpackage.achv
    public final achs f() {
        return this.e;
    }

    @Override // defpackage.achv
    public final boolean m(achq achqVar, achu achuVar) {
        if (achuVar == null) {
            return (achqVar == null || achqVar.g == null) ? false : true;
        }
        return true;
    }

    @Override // defpackage.achv
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void i(aazj aazjVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void j(aazk aazkVar) {
    }

    @Override // defpackage.achv
    public final /* synthetic */ void k(aazn aaznVar) {
    }
}
