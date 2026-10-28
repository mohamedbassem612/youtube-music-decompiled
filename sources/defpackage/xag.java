package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class xag implements adma {
    protected final View a;
    protected final Resources b;
    private final Context c;
    private final aduv d;
    private final TextView e;
    private final ImageView f;
    private final TextView g;
    private final SpannableStringBuilder h;
    private final aeda i;
    private View.OnClickListener j;
    private final adsc k;
    private final xsc l;

    public xag(Context context, aduv aduvVar, xsc xscVar, adsa adsaVar, aciz acizVar, aeda aedaVar) {
        this.c = context;
        aduvVar.getClass();
        this.d = aduvVar;
        this.l = xscVar;
        this.i = aedaVar;
        this.b = context.getResources();
        this.h = new SpannableStringBuilder();
        View viewInflate = View.inflate(context, f(acizVar), null);
        this.a = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(R.id.live_chat_vem_text);
        this.e = textView;
        this.f = (ImageView) viewInflate.findViewById(R.id.live_chat_vem_icon);
        this.g = (TextView) viewInflate.findViewById(R.id.live_chat_vem_button);
        this.k = new adsc(context, adsaVar, true, new adse(textView), true);
    }

    @Override // defpackage.adma
    public final View a() {
        return this.a;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        TextView textView = this.e;
        textView.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        textView.setPadding(0, 0, 0, 0);
    }

    public abstract vxe d();

    public abstract Map e();

    public abstract int f(aciz acizVar);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        if (r0 == defpackage.aliz.SPONSORSHIP_STAR) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
    
        if (r3 == defpackage.aliz.TARGET) goto L79;
     */
    /* JADX WARN: Type inference failed for: r10v22, types: [awmd, java.lang.Object] */
    @Override // defpackage.adma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void hU(defpackage.adly r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xag.hU(adly, java.lang.Object):void");
    }
}
