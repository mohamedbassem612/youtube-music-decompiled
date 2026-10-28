package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.spec.typography.YouTubeAppCompatTextView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class adyu implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ adyu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, vxe] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$cid) {
            case 0:
                ((adxl) obj).a((View) this.a);
                break;
            case 1:
                this.a.a((ajwo) obj);
                break;
            case 2:
                ((TextView) this.a).setCompoundDrawablePadding(((Integer) obj).intValue());
                break;
            case 3:
                GradientDrawable gradientDrawable = (GradientDrawable) obj;
                gradientDrawable.mutate();
                gradientDrawable.setCornerRadius(((YouTubeAppCompatTextView) this.a).j / 2.0f);
                break;
            case 4:
                long jLongValue = ((Long) obj).longValue();
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                arjy arjyVar = (arjy) aihfVar.instance;
                arjy arjyVar2 = arjy.a;
                arjyVar.b |= 32;
                arjyVar.h = jLongValue;
                break;
            case 5:
                ((xir) obj).n((String) this.a);
                break;
            case 6:
                aihf aihfVarCreateBuilder = amiu.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amjm.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amjm amjmVar = (amjm) aihfVarCreateBuilder2.instance;
                amjmVar.c = ((arkf) this.a).z;
                amjmVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
                amjm amjmVar2 = (amjm) aihfVarCreateBuilder2.build();
                amjmVar2.getClass();
                amiuVar.V = amjmVar2;
                amiuVar.d |= 33554432;
                ((xir) obj).h((amiu) aihfVarCreateBuilder.build());
                break;
            case 7:
                ((vxe) ((aelh) this.a).a.c.io()).a((ajwo) obj);
                break;
            case 8:
                int[] iArr = aeqd.a;
                ((aeqt) ((aunn) obj).io()).d((apft) this.a);
                break;
            case 9:
                ((aerh) this.a).a.kk(Boolean.valueOf(((PowerManager) obj).isPowerSaveMode()));
                break;
            case 10:
                asdp asdpVar = (asdp) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                asdq asdqVar = (asdq) aihfVar2.instance;
                asdq asdqVar2 = asdq.a;
                asdpVar.getClass();
                asdqVar.c = asdpVar;
                asdqVar.b |= 1;
                break;
            case 11:
                asic asicVar = (asic) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                asia asiaVar = (asia) aihfVar3.instance;
                asia asiaVar2 = asia.a;
                asicVar.getClass();
                asiaVar.c = asicVar;
                asiaVar.b |= 1;
                break;
            case 12:
                alap alapVar = (alap) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                asia asiaVar3 = (asia) aihfVar4.instance;
                asia asiaVar4 = asia.a;
                alapVar.getClass();
                asiaVar3.d = alapVar;
                asiaVar3.b |= 2;
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                aifz aifzVar = (aifz) aihfVar5.instance;
                aifz aifzVar2 = aifz.a;
                aifzVar.b = zBooleanValue;
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
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
