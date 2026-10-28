package defpackage;

import java.net.URI;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avbq {
    public avbt a(avcm avcmVar, avbo avboVar) {
        return b(URI.create(avcmVar.toString()), avboVar);
    }

    public abstract avbt b(URI uri, avbo avboVar);

    public abstract String c();
}
