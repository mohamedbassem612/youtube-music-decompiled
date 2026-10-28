package app.rive.runtime.kotlin.core;

import defpackage.awmi;
import defpackage.awmp;
import defpackage.awqx;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FileAsset extends NativeObject {
    public static final int $stable = NativeObject.$stable;
    private final awmi cdnUrl$delegate;
    private final awmi name$delegate;
    private final RendererType rendererType;
    private final awmi uniqueFilename$delegate;

    private FileAsset(long j, int i) {
        super(j);
        this.rendererType = RendererType.Companion.fromIndex(i);
        this.name$delegate = new awmp(new Function0() { // from class: app.rive.runtime.kotlin.core.FileAsset$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FileAsset fileAsset = this.f$0;
                return fileAsset.cppName(fileAsset.getCppPointer());
            }
        });
        this.uniqueFilename$delegate = new awmp(new Function0() { // from class: app.rive.runtime.kotlin.core.FileAsset$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FileAsset fileAsset = this.f$0;
                return fileAsset.cppUniqueFilename(fileAsset.getCppPointer());
            }
        });
        this.cdnUrl$delegate = new awmp(new Function0() { // from class: app.rive.runtime.kotlin.core.FileAsset$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FileAsset fileAsset = this.f$0;
                return fileAsset.cppCDNUrl(fileAsset.getCppPointer());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppCDNUrl(long j);

    private final native boolean cppDecode(long j, byte[] bArr, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppName(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public final native String cppUniqueFilename(long j);

    public final boolean decode(byte[] bArr) {
        bArr.getClass();
        return cppDecode(getCppPointer(), bArr, this.rendererType.getValue());
    }

    public final String getCdnUrl() {
        return (String) this.cdnUrl$delegate.a();
    }

    public final String getName() {
        return (String) this.name$delegate.a();
    }

    public final String getUniqueFilename() {
        return (String) this.uniqueFilename$delegate.a();
    }

    public /* synthetic */ FileAsset(long j, int i, awqx awqxVar) {
        this(j, i);
    }
}
