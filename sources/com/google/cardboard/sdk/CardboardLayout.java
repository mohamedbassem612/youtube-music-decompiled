package com.google.cardboard.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CardboardLayout {
    private final FrameLayout alignmentMarker;
    private final ImageButton backButton;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final ImageButton settingsButton;
    private final View view;

    public CardboardLayout(Context context, ViewGroup viewGroup) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.google.android.apps.youtube.music.R.layout.cardboard_ui, viewGroup, false);
        this.view = viewInflate;
        this.alignmentMarker = (FrameLayout) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.ui_alignment_marker);
        this.backButton = (ImageButton) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.ui_back_button);
        this.settingsButton = (ImageButton) viewInflate.findViewById(com.google.android.apps.youtube.music.R.id.ui_settings_button);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideAlignmentMarker$0() {
        this.alignmentMarker.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideBackButton$0() {
        this.backButton.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hideSettingsButton$0() {
        this.settingsButton.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAlignmentMarker$0() {
        this.alignmentMarker.setVisibility(0);
        this.alignmentMarker.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showBackButton$0() {
        this.backButton.setVisibility(0);
        this.backButton.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showSettingsButton$0() {
        this.settingsButton.setVisibility(0);
        this.settingsButton.bringToFront();
    }

    public View getView() {
        return this.view;
    }

    public void hideAlignmentMarker() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$hideAlignmentMarker$0();
            }
        });
    }

    public void hideAll() {
        hideAlignmentMarker();
        hideBackButton();
        hideSettingsButton();
    }

    public void hideBackButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$hideBackButton$0();
            }
        });
    }

    public void hideSettingsButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$hideSettingsButton$0();
            }
        });
    }

    public void setOnBackButtonClick(final Runnable runnable) {
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void setOnSettingskButtonClick(final Runnable runnable) {
        this.settingsButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
    }

    public void showAlignmentMarker() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showAlignmentMarker$0();
            }
        });
    }

    public void showAll() {
        showAlignmentMarker();
        showBackButton();
        showSettingsButton();
    }

    public void showBackButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showBackButton$0();
            }
        });
    }

    public void showSettingsButton() {
        this.handler.post(new Runnable() { // from class: com.google.cardboard.sdk.CardboardLayout$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showSettingsButton$0();
            }
        });
    }
}
