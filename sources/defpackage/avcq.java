package defpackage;

import android.content.Intent;
import j$.util.Objects;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcq extends avbu {
    private static Intent g(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.avbq
    public final avbt a(avcm avcmVar, avbo avboVar) {
        if (Objects.equals(avcmVar.k, "intent")) {
            return new avcp(g(avcmVar.toString()));
        }
        return null;
    }

    @Override // defpackage.avbq
    public final avbt b(URI uri, avbo avboVar) {
        if (Objects.equals(uri.getScheme(), "intent")) {
            return new avcp(g(uri.toString()));
        }
        return null;
    }

    @Override // defpackage.avbq
    public final String c() {
        return "intent";
    }

    @Override // defpackage.avbu
    public final int d() {
        return 3;
    }

    @Override // defpackage.avbu
    public final /* synthetic */ Collection e() {
        return new agqj(avcn.class);
    }

    @Override // defpackage.avbu
    public final void f() {
    }
}
