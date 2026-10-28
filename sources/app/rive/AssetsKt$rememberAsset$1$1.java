package app.rive;

import app.rive.core.CommandQueue;
import defpackage.aif;
import defpackage.atqp;
import defpackage.avkz;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awql;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class AssetsKt$rememberAsset$1$1 extends awpk implements awqk {
    final /* synthetic */ byte[] $bytes;
    final /* synthetic */ awql $constructFn;
    final /* synthetic */ String $key;
    final /* synthetic */ CommandQueue $riveWorker;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsKt$rememberAsset$1$1(awql awqlVar, CommandQueue commandQueue, byte[] bArr, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.$constructFn = awqlVar;
        this.$riveWorker = commandQueue;
        this.$bytes = bArr;
        this.$key = str;
    }

    static final awmy invokeSuspend$lambda$0(String str, Asset asset) {
        if (str != null) {
            try {
                asset.unregister(str);
            } finally {
                asset.close();
            }
        } else {
            asset.close();
        }
        return awmy.a;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        AssetsKt$rememberAsset$1$1 assetsKt$rememberAsset$1$1 = new AssetsKt$rememberAsset$1$1(this.$constructFn, this.$riveWorker, this.$bytes, this.$key, awoqVar);
        assetsKt$rememberAsset$1$1.L$0 = obj;
        return assetsKt$rememberAsset$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(aif aifVar, awoq awoqVar) {
        return ((AssetsKt$rememberAsset$1$1) create(aifVar, awoqVar)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        ?? r1 = this.label;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    aif aifVar = (aif) this.L$0;
                    atqp.j(obj);
                    r1 = aifVar;
                } else {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                throw new awmh();
            }
            atqp.j(obj);
            aif aifVar2 = (aif) this.L$0;
            awql awqlVar = this.$constructFn;
            CommandQueue commandQueue = this.$riveWorker;
            byte[] bArr = this.$bytes;
            this.L$0 = aifVar2;
            this.label = 1;
            obj = awqlVar.invoke(commandQueue, bArr, this);
            r1 = aifVar2;
            if (obj == awoxVar) {
                return awoxVar;
            }
            final Asset asset = (Asset) obj;
            String str = this.$key;
            if (str != null) {
                try {
                    asset.register(str);
                } catch (CancellationException e) {
                    try {
                        asset.close();
                    } catch (Exception e2) {
                        avkz.d(e, e2);
                    }
                    throw e;
                } catch (Exception e3) {
                    try {
                        asset.close();
                    } catch (Exception e4) {
                        avkz.d(e3, e4);
                    }
                    r1.f(new Result.Error(e3));
                    return awmy.a;
                }
            }
            r1.f(new Result.Success(asset));
            final String str2 = this.$key;
            Function0 function0 = new Function0() { // from class: app.rive.AssetsKt$rememberAsset$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetsKt$rememberAsset$1$1.invokeSuspend$lambda$0(str2, asset);
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (r1.a(function0, this) == awoxVar) {
                return awoxVar;
            }
            throw new awmh();
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e6) {
            r1.f(new Result.Error(e6));
            return awmy.a;
        }
    }
}
