package defpackage;

import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aesl implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aesl(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.$cid) {
            case 0:
                ((aesn) this.b).a(this.a);
                return;
            case 1:
                ((aeqx) this.b).a(this.a);
                return;
            case 2:
                ((afjk) this.b).stopSelf(this.a);
                return;
            case 3:
                ((aveu) this.b).h.l(this.a);
                return;
            case 4:
                ((aveu) this.b).h.m(this.a);
                return;
            case 5:
                ((axkr) this.b).b.mObserver.onConnectionTypeChanged(this.a);
                return;
            case 6:
                switch (this.a) {
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                    default:
                        throw new IllegalArgumentException("No request status found.");
                    case 6:
                        i = 5;
                        break;
                    case 7:
                        i = 6;
                        break;
                    case 8:
                        i = 7;
                        break;
                    case 9:
                        i = 8;
                        break;
                    case 10:
                        i = 9;
                        break;
                    case 11:
                        i = 10;
                        break;
                    case 12:
                        i = 11;
                        break;
                    case 13:
                        i = 12;
                        break;
                    case 14:
                        i = 13;
                        break;
                    case 15:
                        i = 14;
                        break;
                }
                ((VersionSafeCallbacks$UrlRequestStatusListener) this.b).onStatus(i);
                return;
            default:
                ((VersionSafeCallbacks$UrlRequestStatusListener) this.b).onStatus(this.a);
                return;
        }
    }

    public aesl(Object obj, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = i;
        this.b = obj;
    }

    public aesl(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i, int i2) {
        this.$cid = i2;
        this.b = versionSafeCallbacks$UrlRequestStatusListener;
        this.a = i;
    }
}
