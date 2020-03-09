package com.gibeom.ofriendsmobile.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007\u001a\u001f\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007\u001a$\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u001a\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0018\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H\u0007\u001a2\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0007\u001a\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\tH\u0007\u001a\u0018\u0010#\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006$"}, d2 = {"bindBorderBackground", "", "view", "Landroidx/appcompat/widget/AppCompatTextView;", "selected", "", "bindImageFromUrl", "Landroid/widget/ImageView;", "imageUrl", "", "bindIsGone", "Landroid/view/View;", "isGone", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Ljava/lang/Boolean;)V", "bindLcTextColor", "bindLoading", "Landroid/widget/ProgressBar;", "status", "bindRadiusImageFromUrl", "radiusImageFromUrl", "radiusValue", "", "bindRenderHtml", "Landroid/widget/TextView;", "description", "bindSetMoney", "value", "bindTextFormat", "formatName", "formatText", "", "formatText2", "bindTextStyle", "style", "bindWhiteRdBg", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"isGone"})
    public static final void bindIsGone(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isGone) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isGone"})
    public static final void bindIsGone(@org.jetbrains.annotations.NotNull()
    com.google.android.material.floatingactionbutton.FloatingActionButton view, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isGone) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isLoading"})
    public static final void bindLoading(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar view, @org.jetbrains.annotations.Nullable()
    java.lang.String status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageFromUrl"})
    public static final void bindImageFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"radiusImageFromUrl", "radiusValue"})
    public static final void bindRadiusImageFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String radiusImageFromUrl, int radiusValue) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"textStyle"})
    public static final void bindTextStyle(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, @org.jetbrains.annotations.NotNull()
    java.lang.String style) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setBorderBackground"})
    public static final void bindBorderBackground(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, boolean selected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setWhRadBackground"})
    public static final void bindWhiteRdBg(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, boolean selected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setLcTextColor"})
    public static final void bindLcTextColor(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, boolean selected) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"renderHtml"})
    public static final void bindRenderHtml(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String description) {
    }
    
    @androidx.databinding.BindingAdapter(requireAll = false, value = {"formatName", "formatText", "formatText2"})
    public static final void bindTextFormat(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String formatName, @org.jetbrains.annotations.Nullable()
    java.lang.Object formatText, @org.jetbrains.annotations.Nullable()
    java.lang.Object formatText2) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"setMoney"})
    public static final void bindSetMoney(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatTextView view, int value) {
    }
}