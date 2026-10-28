package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.search.ui.SearchToolbarView;
import com.google.android.apps.youtube.music.ui.text.PlainTextEditText;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gxv implements TextWatcher {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public gxv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$cid) {
            case 0:
                ((gxx) this.a).d();
                break;
            case 1:
                ((gti) this.a).d();
                break;
            case 2:
                ((ilc) this.a).i(editable != null ? editable.toString() : null);
                break;
            case 3:
                Object obj = this.a;
                if (!kro.M((cc) obj)) {
                    ioc iocVar = (ioc) obj;
                    iocVar.x = editable.toString();
                    iocVar.z.a(alxs.KEYBOARD);
                    iocVar.i(iocVar.x);
                    iocVar.g();
                }
                break;
            case 4:
                editable.getClass();
                SearchToolbarView searchToolbarView = (SearchToolbarView) this.a;
                searchToolbarView.h();
                if (!searchToolbarView.k().l(9, 45780438L, false)) {
                    PlainTextEditText plainTextEditText = searchToolbarView.b;
                    Editable text = plainTextEditText.getText();
                    if (text == null || text.length() == 0) {
                        plainTextEditText.setPaddingRelative(plainTextEditText.getPaddingStart(), plainTextEditText.getPaddingTop(), searchToolbarView.getContext().getResources().getDimensionPixelSize(R.dimen.search_header_text_padding_start), plainTextEditText.getPaddingBottom());
                    } else {
                        plainTextEditText.setPaddingRelative(plainTextEditText.getPaddingStart(), plainTextEditText.getPaddingTop(), searchToolbarView.getContext().getResources().getDimensionPixelSize(R.dimen.search_header_text_padding_end), plainTextEditText.getPaddingBottom());
                    }
                }
                break;
            case 5:
                jem jemVar = (jem) this.a;
                MenuItem menuItemFindItem = jemVar.j.f().findItem(R.id.done_editing);
                if (menuItemFindItem != null) {
                    String strTrim = jemVar.g.getText().toString().trim();
                    menuItemFindItem.setEnabled(!TextUtils.isEmpty(strTrim) && strTrim.length() <= jemVar.a.getResources().getInteger(R.integer.create_playlist_title_max_length));
                }
                jemVar.k.setText(jemVar.g.getText().toString().trim());
                break;
            case 6:
                jjy jjyVar = (jjy) this.a;
                jjyVar.k();
                String string = editable.toString();
                Iterator it = jjyVar.c.iterator();
                while (it.hasNext()) {
                    ((jjs) it.next()).u(string);
                }
                break;
            case 7:
                boolean zIsEmpty = TextUtils.isEmpty(editable);
                Object obj2 = this.a;
                if (zIsEmpty) {
                    jmg jmgVar = (jmg) obj2;
                    ImageView imageView = jmgVar.af;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ImageView imageView2 = jmgVar.ae;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    jmgVar.r(false);
                } else {
                    jmg jmgVar2 = (jmg) obj2;
                    jls jlsVar = jmgVar2.au;
                    if (jlsVar == null || jlsVar.n() == 1) {
                        ImageView imageView3 = jmgVar2.af;
                        if (imageView3 != null && !jmgVar2.as) {
                            imageView3.setVisibility(0);
                        }
                        ImageView imageView4 = jmgVar2.ae;
                        if (imageView4 != null) {
                            imageView4.setVisibility(8);
                        }
                        jmgVar2.r(true);
                    }
                }
                ((jmg) this.a).D();
                break;
            case 10:
                upo upoVar = (upo) this.a;
                if (upoVar.p()) {
                    upoVar.i(upo.o(editable));
                } else if (!upo.o(editable)) {
                    upoVar.c(false);
                } else {
                    upoVar.c(true);
                    upoVar.d.setEnabled(true);
                }
                break;
            case 11:
                ((vgu) this.a).m();
                break;
            case 12:
                ((adny) this.a).a();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.$cid == 4) {
            charSequence.getClass();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
                break;
            case 4:
                charSequence.getClass();
                break;
            case 8:
                ((roe) this.a).m(false);
                break;
            case 9:
                ssz sszVar = (ssz) this.a;
                sszVar.l(sszVar.r());
                float lineSpacingExtra = sszVar.r.getLineSpacingExtra();
                float lineSpacingMultiplier = sszVar.r.getLineSpacingMultiplier();
                sszVar.r.setLineSpacing(0.0f, 1.0f);
                sszVar.r.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
                break;
            default:
                Iterator it = ((aekq) ((awgg) this.a).c).a.iterator();
                while (it.hasNext()) {
                    ((aekx) it.next()).k = charSequence.toString();
                }
                break;
        }
    }
}
