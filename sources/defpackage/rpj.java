package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rpj implements adma {
    private final /* synthetic */ int $cid;
    private final Object a;

    public rpj(Context context, int i, char[] cArr) {
        this.$cid = i;
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.other_accounts_header, (ViewGroup) null);
        this.a = textView;
    }

    @Override // defpackage.adma
    public final View a() {
        Object obj;
        int i = this.$cid;
        if (i == 0 || i == 1) {
            obj = this.a;
        } else {
            obj = this.a;
            if (i != 2) {
                return ((acxt) obj).a();
            }
        }
        return (View) obj;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        int i = this.$cid;
        if (i == 0 || i == 1 || i == 2) {
            return;
        }
        ((acxt) this.a).b(admhVar);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            return;
        }
        if (i == 2) {
            return;
        }
        acxm acxmVar = (acxm) obj;
        acxt acxtVar = (acxt) this.a;
        acxtVar.a = acxmVar;
        acxtVar.h(adlyVar, acxmVar, acxmVar.b().c, false);
    }

    public rpj(Context context, int i, byte[] bArr) {
        this.$cid = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.music_menu_item_divider, (ViewGroup) null);
    }

    public rpj(Context context, int i) {
        this.$cid = i;
        this.a = LayoutInflater.from(context).inflate(R.layout.account_switcher_loading, (ViewGroup) null);
    }

    public rpj(acxt acxtVar, int i) {
        this.$cid = i;
        this.a = acxtVar;
    }
}
