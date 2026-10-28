package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyd implements eyw, eyf {
    private final /* synthetic */ int $cid;
    private final Context a;

    public eyd(Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // defpackage.eyf
    public final Class a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? InputStream.class : AssetFileDescriptor.class;
        }
        return Drawable.class;
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new eyg(this.a, (eyf) this, 0) : new eyg(this.a, (eyf) this, 0);
        }
        return new eyg(this.a, (eyf) this, 0);
    }

    @Override // defpackage.eyf
    public final /* synthetic */ Object d(Resources.Theme theme, Resources resources, int i) {
        int i2 = this.$cid;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        Context context = this.a;
        return fbw.a(context, context, i, theme);
    }

    @Override // defpackage.eyf
    public final /* synthetic */ void e(Object obj) throws IOException {
        int i = this.$cid;
        if (i == 0) {
        } else if (i != 1) {
            ((InputStream) obj).close();
        } else {
            ((AssetFileDescriptor) obj).close();
        }
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
