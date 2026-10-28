package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahsx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ahsx(FirebaseMessaging firebaseMessaging, String str, ahtk ahtkVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = ahtkVar;
    }

    public /* synthetic */ ahsx(ConcurrentHashMap concurrentHashMap, acjx acjxVar, ListenableFuture listenableFuture) {
        this.b = concurrentHashMap;
        this.a = acjxVar;
        this.c = listenableFuture;
    }

    public ahsx(nwj nwjVar, RecyclerView recyclerView, dd ddVar) {
        this.c = nwjVar;
        this.b = recyclerView;
        this.a = ddVar;
    }
}
