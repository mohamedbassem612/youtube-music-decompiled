package defpackage;

import com.google.android.apps.youtube.proto.streaming.CuepointListOuterClass$CuepointContext;
import com.google.android.libraries.blocks.runtime.BaseClient;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aalb implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aalb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.add(tzk.d(this.b.g(wfs.g(76, (String) obj)).g(aret.class)));
                break;
            case 1:
                String str = (String) obj;
                ((agkh) this.b).e(str, ((JSONObject) this.a).optString(str, ""));
                break;
            case 2:
                CuepointListOuterClass$CuepointContext cuepointListOuterClass$CuepointContext = (CuepointListOuterClass$CuepointContext) obj;
                cuepointListOuterClass$CuepointContext.getClass();
                ((awku) this.b).kk(new aaxa(new ywv(cuepointListOuterClass$CuepointContext), (String) this.a));
                break;
            case 3:
                ?? r0 = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ((agjz) this.a).h(new aeqc((aksa) obj, r0.b() / 1000));
                break;
            case 4:
                aqhl aqhlVar = (aqhl) obj;
                if (!Objects.equals(aqhlVar.e, this.a)) {
                    Object obj2 = this.b;
                    acfz.an(((adcw) obj2).j, aqhlVar, new adct(0), true);
                }
                break;
            case 5:
                Object obj3 = this.a;
                adcw adcwVar = (adcw) this.b;
                adcwVar.j.E((String) obj3, (String) obj, adcwVar);
                break;
            case 6:
                Object obj4 = this.b;
                ((axlj) this.a).a.put((String) obj, obj4);
                break;
            default:
                ((mav) obj).c((BaseClient) this.b, (String) this.a);
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

    public /* synthetic */ aalb(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
