package com.google.android.libraries.youtube.media.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ProofOfOriginTokenManager {
    public abstract byte[] mintPoTokenImmediately();

    public abstract void startMintingPoTokenWithRefresh(OnPoTokenMintedCallback onPoTokenMintedCallback);
}
