package app.rive.runtime.kotlin;

import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import app.rive.runtime.kotlin.core.RendererType;
import defpackage.a;
import defpackage.awqx;
import defpackage.eqf;
import defpackage.eqh;
import defpackage.eqk;
import defpackage.eqo;
import defpackage.eqp;
import defpackage.eqq;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RiveFileRequest extends eqk {
    public static final int $stable = 8;
    private final FileAssetLoader assetLoader;
    private final eqp listener;
    private final RendererType rendererType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFileRequest(String str, RendererType rendererType, eqp eqpVar, eqo eqoVar, FileAssetLoader fileAssetLoader) {
        super(0, str, eqoVar);
        str.getClass();
        rendererType.getClass();
        eqpVar.getClass();
        eqoVar.getClass();
        this.rendererType = rendererType;
        this.listener = eqpVar;
        this.assetLoader = fileAssetLoader;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eqk
    public void deliverResponse(File file) {
        file.getClass();
        this.listener.onResponse(file);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006 A[Catch: UnsupportedEncodingException -> 0x001e, TryCatch #0 {UnsupportedEncodingException -> 0x001e, blocks: (B:3:0x0002, B:6:0x0009, B:5:0x0006), top: B:11:0x0002 }] */
    @Override // defpackage.eqk
    protected eqq parseNetworkResponse(eqf eqfVar) {
        Object obj;
        if (eqfVar != null) {
            try {
                obj = eqfVar.b;
                if (obj == null) {
                    obj = new byte[0];
                }
            } catch (UnsupportedEncodingException e) {
                return new eqq(new eqh(e));
            }
        } else {
            obj = new byte[0];
        }
        return new eqq(new File((byte[]) obj, this.rendererType, this.assetLoader), a.bF(eqfVar));
    }

    public /* synthetic */ RiveFileRequest(String str, RendererType rendererType, eqp eqpVar, eqo eqoVar, FileAssetLoader fileAssetLoader, int i, awqx awqxVar) {
        this(str, rendererType, eqpVar, eqoVar, (i & 16) != 0 ? null : fileAssetLoader);
    }
}
