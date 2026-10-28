package defpackage;

import android.graphics.Bitmap;
import android.util.Patterns;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vgu extends uib {
    public String a;
    public Bitmap b;
    public EditText c;
    private final cf d;
    private View e;
    private View f;
    private View g;
    private WebView h;
    private YouTubeButton i;
    private final qcb j;

    public vgu(cf cfVar, qcb qcbVar) {
        super(cfVar, cfVar.getSupportFragmentManager(), true, false);
        this.d = cfVar;
        this.j = qcbVar;
    }

    @Override // defpackage.uib
    protected final View b() {
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(this.d, R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_fragment, (ViewGroup) null);
        this.c = (EditText) viewInflate.findViewById(R.id.link_input);
        this.f = viewInflate.findViewById(R.id.clear_input);
        this.g = viewInflate.findViewById(R.id.scroll_view);
        this.h = (WebView) viewInflate.findViewById(R.id.link_preview);
        this.e = viewInflate.findViewById(R.id.link_input_frame);
        this.c.addTextChangedListener(new gxv(this, 11));
        this.c.setOnEditorActionListener(new jly(this, 3));
        this.f.setOnClickListener(new uit(this, 20));
        YouTubeButton youTubeButton = (YouTubeButton) viewInflate.findViewById(R.id.link_sticker_add_button);
        this.i = youTubeButton;
        youTubeButton.setOnClickListener(new vhv(this, 1));
        m();
        this.h.setWebViewClient(new vgs(this));
        this.h.setWebChromeClient(new vgt(this));
        this.h.setScrollBarStyle(33554432);
        this.h.setScrollbarFadingEnabled(false);
        WebSettings settings = this.h.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
        }
        return viewInflate;
    }

    @Override // defpackage.uib
    protected final String c() {
        return this.d.getResources().getString(R.string.stories_add_link_header);
    }

    @Override // defpackage.uib, defpackage.uih
    public final boolean k() {
        if (this.g.getVisibility() != 0) {
            return false;
        }
        if (this.h.canGoBack()) {
            this.h.goBack();
        } else {
            this.g.setVisibility(8);
            this.e.setVisibility(0);
            this.i.setText(R.string.stories_link_sticker_preview);
        }
        return true;
    }

    public final void l() {
        String string = this.c.getText().toString();
        int i = 0;
        if (this.g.getVisibility() == 8) {
            if (Patterns.WEB_URL.matcher(string).matches()) {
                this.e.setVisibility(8);
                this.g.setVisibility(0);
                this.h.loadUrl(string);
                this.i.setText(R.string.stories_add_link_sticker);
                return;
            }
            return;
        }
        qcb qcbVar = this.j;
        String str = this.a;
        Bitmap bitmap = this.b;
        vik vikVar = (vik) qcbVar.a;
        cf cfVar = vikVar.b;
        View viewInflate = LayoutInflater.from(cfVar).inflate(R.layout.link_sticker_card, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.page_title)).setText(str);
        ((TextView) viewInflate.findViewById(R.id.link_url)).setText(string);
        if (bitmap != null) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
        aihf aihfVarCreateBuilder = auas.a.createBuilder();
        auao auaoVar = auao.a;
        aihfVarCreateBuilder.copyOnWrite();
        auas auasVar = (auas) aihfVarCreateBuilder.instance;
        auaoVar.getClass();
        auasVar.d = auaoVar;
        auasVar.c = 13;
        auas auasVar2 = (auas) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = auat.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        auat auatVar = (auat) aihfVarCreateBuilder2.instance;
        auasVar2.getClass();
        auatVar.e = auasVar2;
        auatVar.b |= 4;
        zf zfVar = vikVar.g;
        vikVar.c.getClass();
        yno.fH(cfVar, zfVar, viewInflate, aihfVarCreateBuilder2, new vij(i));
        vikVar.e.d();
        this.c.setText("");
    }

    public final void m() {
        int length = this.c.getEditableText().length();
        View view = this.f;
        if (length != 0) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
