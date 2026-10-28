package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ezf implements eyw, ezg {
    private final /* synthetic */ int $cid;
    private final ContentResolver a;
    private final boolean b;

    public ezf(ContentResolver contentResolver, boolean z, int i) {
        this.$cid = i;
        this.a = contentResolver;
        this.b = z;
    }

    @Override // defpackage.ezg
    public final euh a(Uri uri) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new eux(this.a, uri, this.b) : new eud(this.a, uri, this.b);
        }
        return new eup(this.a, uri, this.b);
    }

    @Override // defpackage.eyw
    public final eyv b(eza ezaVar) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new ezh(this) : new ezh(this);
        }
        return new ezh(this);
    }

    @Override // defpackage.eyw
    public final void c() {
    }
}
