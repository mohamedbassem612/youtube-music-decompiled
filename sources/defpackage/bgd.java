package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgd implements bgh {
    private final MessageLite a;
    private final ExtensionRegistryLite b;

    public bgd(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        messageLite.getClass();
        extensionRegistryLite.getClass();
        this.a = messageLite;
        this.b = extensionRegistryLite;
    }

    @Override // defpackage.bgh
    public final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.bgh
    public final Object b(InputStream inputStream) throws bdu {
        try {
            Object objG = this.a.getParserForType().g(inputStream, this.b);
            objG.getClass();
            return objG;
        } catch (aiik e) {
            throw new bdu("Cannot read proto.", e);
        }
    }

    @Override // defpackage.bgh
    public final /* bridge */ /* synthetic */ Object c(Object obj, OutputStream outputStream) {
        ((MessageLite) obj).writeTo(outputStream);
        return awmy.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bgd(MessageLite messageLite) {
        ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
        extensionRegistryLite.getClass();
        this(messageLite, extensionRegistryLite);
    }
}
