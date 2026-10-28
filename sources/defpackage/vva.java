package defpackage;

import android.graphics.Rect;
import android.widget.LinearLayout;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vva implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ vva(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [axsp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [avlw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, mbb] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        String str;
        long jLongValue;
        String str2;
        switch (this.$cid) {
            case 0:
                this.a.kk((Rect) obj);
                break;
            case 1:
                ((vuw) this.a).b = ((Integer) obj).intValue();
                break;
            case 2:
                ((vvd) this.a).c.kk(Integer.valueOf(((Rect) obj).top));
                break;
            case 3:
                this.a.invoke(obj);
                break;
            case 4:
                this.a.d((asdy) obj);
                break;
            case 5:
                this.a.d((alik) obj);
                break;
            case 6:
                this.a.invoke(obj);
                break;
            case 7:
                this.a.invoke(obj);
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.kk((weo) obj);
                break;
            case 10:
                this.a.kk((agev) obj);
                break;
            case 11:
                this.a.invoke(obj);
                break;
            case 12:
                this.a.invoke(obj);
                break;
            case 13:
                for (int i = 0; i < ((agkz) obj).size() - this.a.size(); i++) {
                    break;
                }
                break;
            case 14:
                weo weoVar = (weo) obj;
                try {
                    weh wehVar = weoVar.c;
                    Object obj2 = this.a;
                    if (wehVar == null) {
                        ((wwn) obj2).o();
                    } else {
                        asps aspsVar = asps.a;
                        asps aspsVar2 = (asps) ((aihf) aspsVar.createBuilder().mergeFrom(wehVar.c(), ExtensionRegistryLite.getGeneratedRegistry())).build();
                        weh wehVar2 = weoVar.b;
                        if (wehVar2 == null || ((asps) ((aihf) aspsVar.createBuilder().mergeFrom(wehVar2.c(), ExtensionRegistryLite.getGeneratedRegistry())).build()).b != aspsVar2.b) {
                            if (aspsVar2.b) {
                                ((wwn) obj2).o();
                            } else {
                                ((wwn) obj2).k();
                            }
                        }
                    }
                } catch (aiik e) {
                    ((agrc) ((agrc) ((agrc) wwn.a.b()).j(e)).k("com/google/android/libraries/youtube/livechat/controller/LiveChatController", "updateChatStateFromToggleEntity", (char) 526, "LiveChatController.java")).t("Error parsing live chat toggle entity");
                    return;
                }
                break;
            case 15:
                ((wwn) this.a).j((aazk) obj);
                break;
            case 16:
                weo weoVar2 = (weo) obj;
                akhu akhuVar = (akhu) weoVar2.b;
                akhu akhuVar2 = (akhu) weoVar2.c;
                if (akhuVar != null && akhuVar2 != null) {
                    wyq wyqVar = (wyq) this.a;
                    if (wyqVar.g != null && akhuVar.getCreatorGoalState() == akhy.CREATOR_GOAL_STATE_ACTIVE && akhuVar2.getCreatorGoalState() == akhy.CREATOR_GOAL_STATE_COMPLETE) {
                        wyqVar.g.f();
                        break;
                    }
                }
                break;
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue) {
                    xay xayVar = (xay) obj3;
                    xayVar.e.setAlpha(0.0f);
                    LinearLayout linearLayout = xayVar.m;
                    linearLayout.setAlpha(1.0f);
                    linearLayout.setTranslationY(0.0f);
                    linearLayout.setVisibility(0);
                } else {
                    xay xayVar2 = (xay) obj3;
                    if (!xayVar2.o.isRunning()) {
                        xayVar2.e.setAlpha(1.0f);
                        xayVar2.m.setVisibility(8);
                    }
                }
                break;
            case 18:
                weo weoVar3 = (weo) obj;
                apka apkaVar = (apka) weoVar3.c;
                apka apkaVar2 = (apka) weoVar3.b;
                Object obj4 = this.a;
                long jLongValue2 = 0;
                if (apkaVar != null) {
                    str = apkaVar.getReplyCount().c;
                    jLongValue = apkaVar.getReplyCountNumber().longValue();
                } else {
                    str = ((xay) obj4).n;
                    jLongValue = 0;
                }
                if (apkaVar2 != null) {
                    str2 = apkaVar2.getReplyCount().c;
                    jLongValue2 = apkaVar2.getReplyCountNumber().longValue();
                } else {
                    str2 = ((xay) obj4).n;
                }
                if (jLongValue <= jLongValue2 || str.equals(str2)) {
                    ((xay) obj4).l.setText(str);
                } else {
                    xay xayVar3 = (xay) obj4;
                    xayVar3.v(str2, str, xayVar3.l);
                }
                break;
            case 19:
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 13;
                zvjVarA.d("Exception while subscribing to replyCountEntity");
                zvjVarA.f((Throwable) obj);
                ((xay) this.a).k.a(zvjVarA.a());
                break;
            default:
                weo weoVar4 = (weo) obj;
                akuv akuvVar = (akuv) weoVar4.c;
                akuv akuvVar2 = (akuv) weoVar4.b;
                xay xayVar4 = (xay) this.a;
                amky amkyVarU = xayVar4.u();
                xayVar4.w(akuvVar, amkyVarU, akuvVar2, amkyVarU);
                break;
        }
    }
}
