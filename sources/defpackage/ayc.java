package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ayc implements ayd {
    private final ContentInfo a;

    public ayc(ContentInfo contentInfo) {
        azs.l(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.ayd
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.ayd
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.ayd
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.ayd
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + '}';
    }
}
