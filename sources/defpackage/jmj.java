package defpackage;

import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import app.rive.semantics.SemanticState;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jmj implements IntConsumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jmj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.$cid) {
            case 0:
                ((SwipeRefreshLayout) this.a).i(i);
                break;
            case 1:
                ccm ccmVar = ((ccl) this.a).c;
                if (!ccmVar.y) {
                    ccmVar.Y(1, 19, Integer.valueOf(i));
                }
                break;
            case 2:
                ((TextView) this.a).setTextAppearance(i);
                break;
            case 3:
                ((TextView) this.a).setTextAppearance(i);
                break;
            case 4:
                aihf aihfVar = ((zui) this.a).f;
                long j = ((akkq) aihfVar.instance).X + ((long) i);
                aihfVar.copyOnWrite();
                akkq akkqVar = (akkq) aihfVar.instance;
                akkqVar.d |= SemanticState.LiveRegion;
                akkqVar.X = j;
                break;
            case 5:
                aihf aihfVar2 = ((zui) this.a).f;
                long j2 = ((akkq) aihfVar2.instance).V + ((long) i);
                aihfVar2.copyOnWrite();
                akkq akkqVar2 = (akkq) aihfVar2.instance;
                akkqVar2.d |= SemanticState.Focused;
                akkqVar2.V = j2;
                break;
            case 6:
                ((zui) this.a).b(i);
                break;
            case 7:
                aihf aihfVar3 = ((zui) this.a).f;
                long j3 = ((akkq) aihfVar3.instance).R + ((long) i);
                aihfVar3.copyOnWrite();
                akkq akkqVar3 = (akkq) aihfVar3.instance;
                akkqVar3.d |= 8;
                akkqVar3.R = j3;
                break;
            case 8:
                aihf aihfVar4 = ((zui) this.a).f;
                long j4 = ((akkq) aihfVar4.instance).T + ((long) i);
                aihfVar4.copyOnWrite();
                akkq akkqVar4 = (akkq) aihfVar4.instance;
                akkqVar4.d |= 32;
                akkqVar4.T = j4;
                break;
            case 9:
                aihf aihfVar5 = ((zui) this.a).f;
                long j5 = ((akkq) aihfVar5.instance).P + ((long) i);
                aihfVar5.copyOnWrite();
                akkq akkqVar5 = (akkq) aihfVar5.instance;
                akkqVar5.d |= 2;
                akkqVar5.P = j5;
                break;
            case 10:
                aihf aihfVar6 = ((zui) this.a).f;
                long j6 = ((akkq) aihfVar6.instance).k + ((long) i);
                aihfVar6.copyOnWrite();
                akkq akkqVar6 = (akkq) aihfVar6.instance;
                akkqVar6.c |= 16;
                akkqVar6.k = j6;
                break;
            case 11:
                aihf aihfVar7 = ((zui) this.a).f;
                long j7 = ((akkq) aihfVar7.instance).aj + ((long) i);
                aihfVar7.copyOnWrite();
                akkq akkqVar7 = (akkq) aihfVar7.instance;
                akkqVar7.d |= 4194304;
                akkqVar7.aj = j7;
                break;
            case 12:
                aihf aihfVar8 = ((zui) this.a).f;
                long j8 = ((akkq) aihfVar8.instance).G + ((long) i);
                aihfVar8.copyOnWrite();
                akkq akkqVar8 = (akkq) aihfVar8.instance;
                akkqVar8.c |= 8388608;
                akkqVar8.G = j8;
                break;
            case 13:
                aihf aihfVar9 = ((zui) this.a).f;
                long j9 = ((akkq) aihfVar9.instance).N + ((long) i);
                aihfVar9.copyOnWrite();
                akkq akkqVar9 = (akkq) aihfVar9.instance;
                akkqVar9.c |= 1073741824;
                akkqVar9.N = j9;
                break;
            case 14:
                aihf aihfVar10 = ((zui) this.a).f;
                long j10 = ((akkq) aihfVar10.instance).L + ((long) i);
                aihfVar10.copyOnWrite();
                akkq akkqVar10 = (akkq) aihfVar10.instance;
                akkqVar10.c |= 268435456;
                akkqVar10.L = j10;
                break;
            case 15:
                ((zui) this.a).b(i);
                break;
            default:
                ((zui) this.a).b(i);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
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
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            default:
                break;
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }
}
