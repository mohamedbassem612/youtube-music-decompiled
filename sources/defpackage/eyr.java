package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyr implements eyv {
    private final /* synthetic */ int $cid;
    private final Object a;

    public eyr(Context context, int i, byte[] bArr) {
        this.$cid = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.eyv
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return ept.q((Uri) obj);
        }
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            Uri uri = (Uri) obj;
            if (ept.q(uri) && ept.s(uri)) {
                return true;
            }
        } else {
            Uri uri2 = (Uri) obj;
            if (ept.q(uri2) && !ept.s(uri2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [eyj, java.lang.Object] */
    @Override // defpackage.eyv
    public final /* synthetic */ hed b(Object obj, int i, int i2, ety etyVar) {
        Long l;
        int i3 = this.$cid;
        if (i3 == 0) {
            Uri uri = (Uri) obj;
            return new hed(new ffd(uri), new eyq((Context) this.a, uri));
        }
        if (i3 == 1) {
            File file = (File) obj;
            return new hed(new ffd(file), new eyi(file, (eyj) this.a, 0));
        }
        if (i3 == 2) {
            Uri uri2 = (Uri) obj;
            if (!ept.r(i, i2)) {
                return null;
            }
            ffd ffdVar = new ffd(uri2);
            Context context = (Context) this.a;
            return new hed(ffdVar, eyi.b(context, uri2, new euy(context.getContentResolver())));
        }
        Uri uri3 = (Uri) obj;
        if (!ept.r(i, i2) || (l = (Long) etyVar.b(fbr.a)) == null || l.longValue() != -1) {
            return null;
        }
        ffd ffdVar2 = new ffd(uri3);
        Context context2 = (Context) this.a;
        return new hed(ffdVar2, eyi.b(context2, uri3, new euz(context2.getContentResolver())));
    }

    public eyr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public eyr(Context context, int i, char[] cArr) {
        this.$cid = i;
        this.a = context.getApplicationContext();
    }
}
