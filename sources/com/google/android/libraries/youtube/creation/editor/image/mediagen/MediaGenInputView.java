package com.google.android.libraries.youtube.creation.editor.image.mediagen;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import defpackage.aewp;
import defpackage.afnb;
import defpackage.afnq;
import defpackage.afov;
import defpackage.afpe;
import defpackage.afpi;
import defpackage.aguu;
import defpackage.ahno;
import defpackage.aupa;
import defpackage.auph;
import defpackage.azs;
import defpackage.bac;
import defpackage.uhe;
import defpackage.upk;
import defpackage.upo;
import defpackage.upq;
import defpackage.upt;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class MediaGenInputView extends upt implements afnb {
    public upo a;
    private Context b;

    @Deprecated
    public MediaGenInputView(Context context) {
        super(context);
        e();
    }

    private final upo d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            upq upqVar = (upq) aguu.as(this, upq.class);
            upk upkVar = new upk(this, 0);
            afpi.c(upkVar);
            try {
                upo upoVarB = upqVar.b();
                this.a = upoVarB;
                if (upoVarB == null) {
                    afpi.b(upkVar);
                }
                this.a.p = this;
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof auph) && !(context instanceof aupa) && !(context instanceof afpe)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (context instanceof afov) {
                    return;
                }
                throw new IllegalStateException("TikTok View " + getClass().toString() + ", cannot be attached to a non-TikTok Fragment");
            } catch (Throwable th) {
                if (this.a == null) {
                    afpi.b(upkVar);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.afnb
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final upo peer() {
        upo upoVar = this.a;
        if (upoVar != null) {
            return upoVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.afnb
    public final Class getPeerClass() {
        return upo.class;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (aewp.m(getContext())) {
            Context contextN = aewp.n(this);
            Context context = this.b;
            if (context == null) {
                this.b = contextN;
            } else {
                boolean z = true;
                if (context != contextN && !aewp.o(context)) {
                    z = false;
                }
                ahno.P(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        d().e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        upo upoVarD = d();
        if (upoVarD.m == null) {
            Log.e("MediaGenInputViewPeer", "Invalid State: fragment is null");
            return;
        }
        EditText editText = upoVarD.c;
        editText.setOnEditorActionListener(null);
        editText.setOnFocusChangeListener(null);
        if (Build.VERSION.SDK_INT >= 31) {
            View rootView = upoVarD.b.getRootView();
            int i = bac.a;
            azs.c(rootView, null);
        }
        Optional optional = upoVarD.l;
        uhe uheVar = new uhe(upoVarD, 16);
        if (true == optional.isPresent()) {
            upo.s(((upo) uheVar.a).m, ((Integer) optional.get()).intValue());
        }
        upoVarD.l = Optional.empty();
        upoVarD.m = null;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    public MediaGenInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaGenInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaGenInputView(afnq afnqVar) {
        super(afnqVar);
        e();
    }
}
