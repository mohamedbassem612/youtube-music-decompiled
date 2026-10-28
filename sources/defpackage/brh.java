package defpackage;

import android.media.VolumeProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class brh extends VolumeProvider {
    final /* synthetic */ brj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brh(brj brjVar, int i, int i2, int i3, String str) {
        super(i, i2, i3, str);
        this.a = brjVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        this.a.b(i);
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        this.a.c(i);
    }
}
