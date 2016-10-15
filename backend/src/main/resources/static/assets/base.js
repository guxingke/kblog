$(function() {
  'use strict';

  var sidebar = $('#sidebar');
  var mask = $('.mask');
  var trigger = $('#sidebar-trigger');

  trigger.on('click',
  function() {
    mask.fadeIn();
    sidebar.css('right', 0);
  })

  mask.on('click',
  function() {
    mask.fadeOut();
    sidebar.css('right', -sidebar.width());
  })

  var backBtn = $('.back-to-top');

  backBtn.on('click',
  function() {
    $('html, body').animate({
      scrollTop: 0
    },
    800)
  });

  $(window).on('scroll',
  function() {
    if ($(window).scrollTop() > $(window).height()) {
      backBtn.fadeIn();
    } else {
      backBtn.fadeOut();
    }
  })
})