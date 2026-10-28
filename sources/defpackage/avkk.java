package defpackage;

import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avkk implements avbf {
    public static final ThreadLocal a = new ThreadLocal();
    public final aiix b;
    public final MessageLite c;

    public avkk(MessageLite messageLite) {
        messageLite.getClass();
        this.c = messageLite;
        this.b = messageLite.getParserForType();
    }
}
