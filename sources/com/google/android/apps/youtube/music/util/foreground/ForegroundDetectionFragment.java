package com.google.android.apps.youtube.music.util.foreground;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import defpackage.jlf;
import defpackage.jlg;
import defpackage.kjs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ForegroundDetectionFragment extends jlg {
    public kjs a;
    private ForegroundDetectionView b;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Set] */
    public final void a(int i) {
        int i2 = i - 1;
        if (i2 != 0 && i2 != 1) {
            ForegroundDetectionView foregroundDetectionView = this.b;
            if (foregroundDetectionView != null) {
                foregroundDetectionView.a = this;
                foregroundDetectionView.invalidate();
                return;
            }
            return;
        }
        kjs kjsVar = this.a;
        kjsVar.a = i;
        for (jlf jlfVar : kjsVar.b) {
            if (i == 1) {
                jlfVar.b();
            } else if (i == 2) {
                jlfVar.a();
            }
        }
    }

    @Override // defpackage.cc
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ForegroundDetectionView foregroundDetectionView = (ForegroundDetectionView) layoutInflater.inflate(R.layout.foreground_detection, viewGroup, false);
        this.b = foregroundDetectionView;
        return foregroundDetectionView;
    }

    @Override // defpackage.cc
    public final void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // defpackage.cc
    public final void onStart() {
        super.onStart();
        a(3);
    }

    @Override // defpackage.cc
    public final void onStop() {
        super.onStop();
        a(2);
    }
}
