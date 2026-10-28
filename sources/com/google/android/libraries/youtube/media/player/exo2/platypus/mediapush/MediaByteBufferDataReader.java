package com.google.android.libraries.youtube.media.player.exo2.platypus.mediapush;

import defpackage.jtk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class MediaByteBufferDataReader extends jtk {
    boolean e = false;

    @Override // defpackage.jtk
    public final boolean i() {
        return !this.e && ((!this.d && this.a) || this.c.remaining() != 0);
    }
}
