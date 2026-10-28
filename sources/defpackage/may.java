package defpackage;

import com.google.android.libraries.blocks.runtime.BaseClient;
import com.google.android.libraries.blocks.runtime.BaseClientCreator;
import com.google.android.libraries.blocks.runtime.ClientCreator;
import com.google.android.libraries.blocks.runtime.ClientCreatorProxy;
import com.google.android.libraries.blocks.runtime.ConcreteClientCreator;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class may {
    public final ClientCreatorProxy a;

    public may(ClientCreatorProxy clientCreatorProxy) {
        this.a = clientCreatorProxy;
    }

    public final BaseClient a(ClientCreator clientCreator) {
        ClientCreatorProxy clientCreatorProxy = this.a;
        return clientCreator.c(clientCreatorProxy.nativeCreateBlock(clientCreatorProxy.a, clientCreator.a()));
    }

    public final BaseClient b(ConcreteClientCreator concreteClientCreator, Function function) {
        ClientCreatorProxy clientCreatorProxy = this.a;
        long j = clientCreatorProxy.a;
        long jNativeCreateInstanceContext = clientCreatorProxy.nativeCreateInstanceContext(j, concreteClientCreator.a());
        return concreteClientCreator.c(clientCreatorProxy.nativeCreateConcreteBlock(j, jNativeCreateInstanceContext, concreteClientCreator.d(function.apply(new may(new ClientCreatorProxy(jNativeCreateInstanceContext))))));
    }

    public final BaseClient c(BaseClientCreator baseClientCreator, Object obj) {
        ClientCreatorProxy clientCreatorProxy = this.a;
        return baseClientCreator.c(clientCreatorProxy.nativeCreateFromWeakRef(clientCreatorProxy.a, baseClientCreator.b(obj)));
    }
}
