package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jcj implements adma {
    private final /* synthetic */ int $cid;
    private final View a;
    private final Object b;

    public jcj(Context context, int i, byte[] bArr) {
        this.$cid = i;
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        View viewInflate = View.inflate(context, R.layout.empty_footer_item, null);
        this.a = viewInflate.findViewById(R.id.separator);
        jdwVar.c(viewInflate);
    }

    @Override // defpackage.adma
    public final View a() {
        int i = this.$cid;
        return (i == 0 || i == 1) ? ((jdw) this.b).a : this.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [admd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [admd, java.lang.Object] */
    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        alay alayVar;
        alay alayVar2;
        int i = this.$cid;
        if (i == 0) {
            amgd amgdVar = (amgd) obj;
            if ((amgdVar.b & 1) != 0) {
                alayVar = amgdVar.c;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
            } else {
                alayVar = null;
            }
            ((TextView) this.a).setText(ackj.k(null, alayVar, null, false));
            this.b.e(adlyVar);
            return;
        }
        if (i == 1) {
            this.a.setVisibility(true == adlyVar.j("isLastMergedItem") ? 4 : 0);
            this.b.e(adlyVar);
            return;
        }
        if (i == 2) {
            ajkf ajkfVar = (ajkf) obj;
            if ((ajkfVar.b & 1) != 0) {
                alayVar2 = ajkfVar.c;
                if (alayVar2 == null) {
                    alayVar2 = alay.a;
                }
            } else {
                alayVar2 = null;
            }
            ((TextView) this.b).setText(ackj.k(null, alayVar2, null, false));
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (alay alayVar3 : ((anxa) obj).c) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append((CharSequence) ackj.k(null, alayVar3, null, false));
        }
        ((TextView) this.b).setText(sb.toString());
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
    }

    public jcj(Context context, int i) {
        this.$cid = i;
        context.getClass();
        jdw jdwVar = new jdw(context);
        this.b = jdwVar;
        TextView textView = (TextView) View.inflate(context, R.layout.item_section_header_item, null);
        this.a = textView;
        jdwVar.c(textView);
    }

    public jcj(Context context, int i, char[] cArr) {
        this.$cid = i;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.live_badge, (ViewGroup) null);
        this.a = linearLayout;
        this.b = (TextView) linearLayout.findViewById(R.id.live_badge_text);
    }

    public jcj(Context context, int i, short[] sArr) {
        this.$cid = i;
        View viewInflate = View.inflate(context, R.layout.music_simple_text, null);
        this.a = viewInflate;
        this.b = (TextView) viewInflate.findViewById(R.id.text);
    }
}
