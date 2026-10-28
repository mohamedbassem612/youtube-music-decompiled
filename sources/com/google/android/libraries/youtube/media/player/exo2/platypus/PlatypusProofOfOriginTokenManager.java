package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.OnPoTokenMintedCallback;
import com.google.android.libraries.youtube.media.interfaces.ProofOfOriginTokenManager;
import defpackage.ywn;
import defpackage.zfe;
import defpackage.zfp;
import defpackage.zfs;
import defpackage.zh;
import defpackage.zhv;
import defpackage.zjr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class PlatypusProofOfOriginTokenManager extends ProofOfOriginTokenManager {
    private final zfs a;
    private final ywn b;
    private final String c;
    private final zjr d;

    public PlatypusProofOfOriginTokenManager(zfs zfsVar, ywn ywnVar, String str, zjr zjrVar) {
        this.a = zfsVar;
        this.b = ywnVar;
        this.c = str;
        this.d = zjrVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.ProofOfOriginTokenManager
    public final byte[] mintPoTokenImmediately() {
        zh zhVar = new zh((byte[]) null, (char[]) null);
        zhVar.m(this.c);
        zfe zfeVarL = zhVar.l();
        zfs zfsVar = this.a;
        zfp zfpVarB = zfsVar.b(zfeVarL);
        if (zfpVarB == null) {
            zfpVarB = zfsVar.a();
            ywn ywnVar = this.b;
            zhv zhvVar = new zhv("potoken.nulloninit");
            zhvVar.c = "Session token not initialized.";
            ywnVar.k(zhvVar.a());
        }
        return zfpVarB.b;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.ProofOfOriginTokenManager
    public final void startMintingPoTokenWithRefresh(OnPoTokenMintedCallback onPoTokenMintedCallback) {
        if (this.d.aP()) {
            if (onPoTokenMintedCallback == null) {
                ywn ywnVar = this.b;
                zhv zhvVar = new zhv("potoken.nocallback");
                zhvVar.c = "No callback received.";
                ywnVar.k(zhvVar.a());
                return;
            }
            zfs zfsVar = this.a;
            zh zhVar = new zh((byte[]) null, (char[]) null);
            zhVar.m(this.c);
            zfsVar.i(onPoTokenMintedCallback, zhVar.l());
        }
    }
}
