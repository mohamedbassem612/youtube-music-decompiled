package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class waq implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ waq(aczl aczlVar, String str, Uri uri, aigj aigjVar, aigj aigjVar2, int i) {
        this.$cid = i;
        this.b = aczlVar;
        this.a = str;
        this.c = uri;
        this.d = aigjVar;
        this.e = aigjVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws onr {
        Object obj;
        int i;
        boolean zAc;
        String message = "";
        int i2 = this.$cid;
        Object obj2 = this.d;
        if (i2 == 0) {
            Object obj3 = this.c;
            String str = this.a;
            Object obj4 = this.b;
            if (obj2 == null || (obj = this.e) == null) {
                aczl aczlVar = (aczl) obj4;
                return ((zpw) aczlVar.f).d(aczlVar.o(str, (Uri) obj3));
            }
            aczl aczlVar2 = (aczl) obj4;
            return afxd.f(((zpw) aczlVar2.f).d(aczlVar2.o(str, (Uri) obj3))).h(new qmw(obj4, ((hed) aczlVar2.g).M((aigj) obj), obj3, obj2, 3, (short[]) null), aczlVar2.c);
        }
        Object obj5 = this.b;
        int i3 = 0;
        try {
            zAc = ((ayq) this.e).ac(qnl.bb((Context) this.c, this.a));
        } catch (qqb unused) {
            oin oinVar = (oin) obj5;
            oip oipVar = (oip) obj2;
            onb.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", oinVar.c, oipVar.d);
            message = String.format("Malformed blob Uri for file %s, group %s", oinVar.c, oipVar.d);
            i = 17;
            i3 = i;
            zAc = false;
        } catch (qqf e) {
            message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            String str2 = ((oin) obj5).c;
            String str3 = ((oip) obj2).d;
            int i4 = onb.a;
            message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
            i = 24;
            i3 = i;
            zAc = false;
        } catch (IOException unused2) {
            oin oinVar2 = (oin) obj5;
            oip oipVar2 = (oip) obj2;
            onb.e("%s: Failed to check existence in the shared storage for file %s, file group %s", "AndroidSharingUtil", oinVar2.c, oipVar2.d);
            message = String.format("Error while checking if file %s, group %s, exists in the shared blob storage.", oinVar2.c, oipVar2.d);
            i = 19;
            i3 = i;
            zAc = false;
        }
        if (i3 == 0) {
            return ahng.n(Boolean.valueOf(zAc));
        }
        throw new onr(i3, message);
    }

    public /* synthetic */ waq(Context context, String str, ayq ayqVar, oin oinVar, oip oipVar, int i) {
        this.$cid = i;
        this.c = context;
        this.a = str;
        this.e = ayqVar;
        this.b = oinVar;
        this.d = oipVar;
    }
}
