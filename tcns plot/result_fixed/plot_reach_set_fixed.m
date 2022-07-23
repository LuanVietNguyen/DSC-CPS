%close all

clear all
ep0 = -200;
ep00 = -700;
M =  dlmread('quadcopter0_reach_set.txt');
x_min = M(:, 2)+ ep0;
x_max = M(:, 3)+ ep0;
y_min= M(:, 6) + ep00;
y_max = M(:, 7)+ ep00;
h1 = figure;
for i = 1: length(x_min)
    pos = [x_min(i), y_min(i),x_max(i) - x_min(i), y_max(i)- y_min(i)];
    rectangle('Position',pos,'FaceColor','b','Edgecolor','b','LineWidth',1.5);
end
hold on
xmin = min(x_min);
xmax = max(x_max);
ymin = min(y_min);
ymax = max(y_max);
pos = [xmin, ymin,xmax - xmin, ymax - ymin];
rectangle('Position',pos,'FaceColor','none','Edgecolor',[.61 .51 .84],'LineWidth',1.5);
ep1 = -250;
ep2 = -350;
hold on
M =  dlmread('quadcopter1_reach_set.txt');
x_min = M(:, 2) + ep1;
x_max = M(:, 3)+ ep1;
y_min= M(:, 6) + ep2;
y_max = M(:, 7) + ep2;
for i = 1: length(x_min)
    pos = [x_min(i), y_min(i),x_max(i) - x_min(i), y_max(i)- y_min(i)];
    rectangle('Position',pos,'FaceColor','r','Edgecolor','r','LineWidth',2.5);
end
hold on
xmin = min(x_min);
xmax = max(x_max);
ymin = min(y_min);
ymax = max(y_max);
pos = [xmin, ymin,xmax - xmin, ymax - ymin];
rectangle('Position',pos,'FaceColor','none','Edgecolor',[.84 .51 .61],'LineWidth',1.5);
xlabel('$x$','Interpreter','latex'), ylabel('$y$','Interpreter','latex')

ep5 = 250;
hold on
M =  dlmread('quadcopter2_reach_set.txt');
x_min = M(:, 2)+ ep5;
x_max = M(:, 3)+ ep5;
y_min= M(:, 6);
y_max = M(:, 7);
for i = 1: length(x_min)
    pos = [x_min(i), y_min(i),x_max(i) - x_min(i), y_max(i)- y_min(i)];
    rectangle('Position',pos,'FaceColor','g','Edgecolor','g','LineWidth',1.5);
end
hold on
xmin = min(x_min) ;
xmax = max(x_max);
ymin = min(y_min);
ymax = max(y_max);
pos = [xmin, ymin,xmax - xmin, ymax - ymin];
rectangle('Position',pos,'FaceColor','none','Edgecolor',[.61 .74 .51],'LineWidth',1.5);
xlabel('$x$','Interpreter','latex'), ylabel('$y$','Interpreter','latex')

%MagInset(h2, ax(1), [0.04 0.045 1 4], [0.05 0.09 5.5 9], {'NW','NW';'SE','SE'});
%set(h1, 'Position',[280, 420, 400, 750]);
%MagInset(h1, -1, [x_min(300)-0.01 x_min(310) y_min(300)-0.1 y_min(310)], [300 360 550 720], {'NW','NE';'SE','SE'});
%MagInset(h1,-1, [1911.5 1913.5 -977 -975], [2100 2700 -600 -300], {'NW','NW';'SE','SE'});
