package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import j$.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class usn implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ usn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        switch (this.$cid) {
            case 0:
                ((aqi) this.a).d((Throwable) obj);
                break;
            case 1:
                this.a.invoke(obj);
                break;
            case 2:
                this.a.invoke(obj);
                break;
            case 3:
                ((View) this.a).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 4:
                ((View) this.a).setEnabled(((Boolean) obj).booleanValue());
                break;
            case 5:
                uwa uwaVar = (uwa) this.a;
                CreationButtonView creationButtonView = uwaVar.c;
                if (creationButtonView != null) {
                    creationButtonView.d = "server_driven_filter_picker";
                }
                uiv uivVar = uwaVar.e;
                if (uivVar != null) {
                    uivVar.k();
                }
                break;
            case 6:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                CreationButtonView creationButtonView2 = ((uwa) this.a).d;
                if (creationButtonView2 != null) {
                    creationButtonView2.d(!zBooleanValue);
                }
                break;
            case 7:
                this.a.invoke(obj);
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                uww uwwVar = uwv.b;
                this.a.invoke(obj);
                break;
            case 12:
                uww uwwVar2 = uwv.b;
                this.a.invoke(obj);
                break;
            case 13:
                this.a.invoke(obj);
                break;
            case 14:
                this.a.invoke(obj);
                break;
            case 15:
                this.a.invoke(obj);
                break;
            case 16:
                Collection.EL.stream((agkz) obj).forEach(new usf(this.a, 9));
                break;
            case 17:
                ((vak) this.a).m();
                break;
            case 18:
                this.a.invoke(obj);
                break;
            case 19:
                if (!((Boolean) obj).booleanValue()) {
                    ((vaq) this.a).b();
                }
                break;
            default:
                ((vat) this.a).o();
                break;
        }
    }
}
