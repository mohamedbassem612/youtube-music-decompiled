package defpackage;

import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hpf implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hpf(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                this.b.add(((hpk) this.a).d.n((String) obj));
                break;
            case 1:
                this.b.add(((hpk) this.a).d.n((String) obj));
                break;
            case 2:
                this.b.add(((hpk) this.a).d.n((String) obj));
                break;
            case 3:
                this.b.add(((hpk) this.a).d.n((String) obj));
                break;
            case 4:
                jav javVar = (jav) this.b;
                ((jau) obj).a(javVar.e, adul.d((View) this.a), javVar.a, javVar.h);
                break;
            case 5:
                Map map = (Map) obj;
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ((jbo) this.a).e);
                Object objC = ((adly) this.b).c("sectionListController");
                if (objC != null) {
                    map.put("sectionListController", objC);
                }
                break;
            case 6:
                Map map2 = (Map) obj;
                map2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ((jbo) this.a).e);
                Object objC2 = ((adly) this.b).c("sectionListController");
                if (objC2 != null) {
                    map2.put("sectionListController", objC2);
                }
                break;
            default:
                Object obj2 = this.a;
                ((aaog) this.b).b((aanq) obj, (aaof) obj2);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ hpf(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
