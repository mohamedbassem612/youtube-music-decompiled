package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iuh implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iuh(hoj hojVar, anuk anukVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, ListenableFuture listenableFuture4, mbb mbbVar, int i) {
        this.$cid = i;
        this.b = hojVar;
        this.e = anukVar;
        this.g = listenableFuture;
        this.d = listenableFuture2;
        this.f = listenableFuture3;
        this.c = listenableFuture4;
        this.a = mbbVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, jkt] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, mbb] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.$cid != 0) {
            this.a.d(((hoj) this.b).d((anuk) this.e, (List) ahng.v(this.g), (List) ahng.v(this.d), ((Boolean) ahng.v(this.f)).booleanValue(), (Optional) ahng.v(this.c)));
            return null;
        }
        ContentResolver contentResolver = ((iuo) ((qcb) this.a).a).e;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        jkm jkmVar = new jkm(contentResolver.query((Uri) this.b, (String[]) this.c, (String) obj3, (String[]) obj2, (String) obj), this.g);
        try {
            return agke.o(jkmVar);
        } finally {
            jku.b(jkmVar);
        }
    }

    public /* synthetic */ iuh(qcb qcbVar, Uri uri, String[] strArr, String str, String[] strArr2, String str2, jkt jktVar, int i) {
        this.$cid = i;
        this.a = qcbVar;
        this.b = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
        this.g = jktVar;
    }
}
