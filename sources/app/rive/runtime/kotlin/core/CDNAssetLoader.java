package app.rive.runtime.kotlin.core;

import android.content.Context;
import app.rive.RiveLog;
import defpackage.a;
import defpackage.awmi;
import defpackage.awmp;
import defpackage.awmy;
import defpackage.awqg;
import defpackage.eqn;
import defpackage.eqo;
import defpackage.equ;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class CDNAssetLoader extends FileAssetLoader {
    public static final int $stable = NativeObject.$stable;
    private final String TAG;
    private final awmi queue$delegate;

    public CDNAssetLoader(final Context context) {
        context.getClass();
        this.TAG = "RiveL/CDNAssetLoader";
        this.queue$delegate = new awmp(new Function0() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.bD(context);
            }
        });
    }

    private final eqn getQueue() {
        return (eqn) this.queue$delegate.a();
    }

    static final awmy loadContents$lambda$0(FileAsset fileAsset, byte[] bArr) {
        bArr.getClass();
        fileAsset.decode(bArr);
        return awmy.a;
    }

    static final void loadContents$lambda$1(CDNAssetLoader cDNAssetLoader, equ equVar) {
        RiveLog.INSTANCE.getLogger().e(cDNAssetLoader.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CDNAssetLoader.loadContents$lambda$1$0();
            }
        });
        equVar.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loadContents$lambda$1$0() {
        return "onAssetLoaded: loading image failed.";
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public boolean loadContents(final FileAsset fileAsset, byte[] bArr) {
        fileAsset.getClass();
        bArr.getClass();
        String cdnUrl = fileAsset.getCdnUrl();
        if (cdnUrl.length() == 0) {
            return false;
        }
        getQueue().a(new BytesRequest(cdnUrl, new awqg() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$$ExternalSyntheticLambda2
            @Override // defpackage.awqg
            public final Object invoke(Object obj) {
                return CDNAssetLoader.loadContents$lambda$0(fileAsset, (byte[]) obj);
            }
        }, new eqo() { // from class: app.rive.runtime.kotlin.core.CDNAssetLoader$$ExternalSyntheticLambda3
            @Override // defpackage.eqo
            public final void onErrorResponse(equ equVar) {
                CDNAssetLoader.loadContents$lambda$1(this.f$0, equVar);
            }
        }));
        return true;
    }
}
